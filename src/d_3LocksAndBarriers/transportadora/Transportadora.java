package d_3LocksAndBarriers.transportadora;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Logger;

public class Transportadora {

    private final List<Package> packages = new ArrayList<>();
    private final Logger logger = Logger.getLogger("Transportadora");
    private final Lock lock = new ReentrantLock(true);
    private final Condition condition = lock.newCondition();
    private final CyclicBarrier clientBarrier;
    private final int max;
    private int packagesMade = 0;

    public Transportadora(int max) {
        clientBarrier = new CyclicBarrier(max);
        this.max = max;
    }

    public void buy(Client client) throws InterruptedException, BrokenBarrierException {
        try {
            lock.lock();
            while (packages.size() > max-1){
                condition.await();
            }
            packages.add(new Package(client));
            String msg = "Encomenda #"+(packages.size()-1)+" order from client #"+client.getId();
            logger.info(msg);
            condition.signal();
        } finally {
            lock.unlock();
        }
        clientBarrier.await();
    }

    public void makeEncomendas() throws InterruptedException{
        try {
            lock.lock();
            if (packagesMade > max-1){
                sentEncomendas();
            }
            while (packages.isEmpty() || packagesMade > max-1){
                condition.await();
            }
            logger.info("Encomenda made");
            packagesMade++;
        } finally {
            lock.unlock();
        }
    }

    private void sentEncomendas() throws InterruptedException {
        try {
            lock.lock();
            for (int i = 0; i < 3; i++) {
                packages.get(i).getClient().receiveEncomenda(packages.get(i));
            }
            packages.remove(packages.get(0));
            packages.remove(packages.get(0));
            packages.remove(packages.get(0));
            condition.signal();
            clientBarrier.reset();
            packagesMade = 0;
        } finally {
            lock.unlock();
        }
    }


    public static void main(String[] args) {
        Transportadora transportadora = new Transportadora(3);
        for (int i = 0; i < 3; i++) {
            new Thread(new Client(i,transportadora)).start();
        }
        new Thread(new Encomenda(transportadora)).start();
    }


}

