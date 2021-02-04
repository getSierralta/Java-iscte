package d_3LocksAndBarriers.transportadora;

import java.util.concurrent.BrokenBarrierException;
import java.util.logging.Logger;

import static java.lang.Thread.sleep;

public class Client implements Runnable{

    private final int id;
    private final Transportadora transportadora;
    private final Logger logger = Logger.getLogger(Thread.currentThread().getName());

    public Client(int id, Transportadora transportadora) {
        this.id = id;
        this.transportadora = transportadora;
    }

    public void receiveEncomenda(Package encomenda) throws InterruptedException {
        String msg = "Client #"+id+" have received the package #"+encomenda.getId();
        logger.info(msg);
        sleep(1000);
    }

    public int getId() {
        return id;
    }

    @Override
    public void run() {
        while (true){
            try {
                transportadora.buy(this);
                sleep(1000);
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
        }
    }
}
