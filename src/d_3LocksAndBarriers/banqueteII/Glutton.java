package d_3LocksAndBarriers.banqueteII;

import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.logging.Logger;

import static java.lang.Thread.sleep;


public class Glutton implements Runnable {

    private final int id1;
    private final Logger logger = Logger.getLogger(Thread.currentThread().getName());
    private final BlockingQueue q;

    public Glutton(int id,  BlockingQueue q) {
        this.id1 = id;
        this.q = q;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Javali javali = (Javali) q.take();
                String msg = "Javali #" + javali.getId() + " taken by glutton #" + id1;
                logger.info(msg);
                Random random = new Random();
                sleep(random.nextInt(5000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
