package d_3LocksAndBarriers.transportadora;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CyclicBarrier;
import java.util.logging.Logger;

public class Transportadora {

    private final List<Package> packages = new ArrayList<>();
    private final Logger logger = Logger.getLogger("Transportadora");
    private final CyclicBarrier clientBarrier;
    private final int max;
    private int packagesMade = 0;

    public Transportadora(int max) {
        clientBarrier = new CyclicBarrier(max);
        this.max = max;
    }

    public synchronized void buy(Client client) {
        packages.add(new Package(client));
        String msg = "Encomenda #" + (packages.size() - 1) + " order from client #" + client.getId();
        logger.info(msg);
    }

    public synchronized void makeEncomendas() throws InterruptedException {
        if (packagesMade > max - 1) {
            sentEncomendas();
        }
        logger.info("Encomenda made");
        packagesMade++;

    }

    private synchronized void sentEncomendas() throws InterruptedException {
        logger.info("Encomendas sent");
        for (int i = 0; i < 3; i++) {
            packages.get(i).getClient().receiveEncomenda(packages.get(i));
        }
        packages.remove(packages.get(0));
        packages.remove(packages.get(0));
        packages.remove(packages.get(0));
        clientBarrier.reset();
        packagesMade = 0;
    }


    public static void main(String[] args) {
        Transportadora transportadora = new Transportadora(3);
        for (int i = 0; i < 3; i++) {
            new Thread(new Client(i, transportadora)).start();
        }
        new Thread(new Encomenda(transportadora)).start();
    }


}

