package d_3LocksAndBarriers.banqueteII;


import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.logging.Logger;
import static java.lang.Thread.currentThread;
import static java.lang.Thread.sleep;

public class Cooker implements Runnable {

    private final int id1;
    Logger logger = Logger.getLogger(currentThread().getName());
    private final BlockingQueue q;

    public Cooker(int id, BlockingQueue q) {
        this.id1 = id;
        this.q = q;
    }

    @Override
    public void run() {
        while (true){
            try {
                Javali javali = new Javali(this);
                q.put(javali);
                String msg = "Javali #"+javali.getId()+" has been put in the table by cooker #"+id1;
                logger.info(msg);
                Random random = new Random();
                sleep(random.nextInt(5000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        BlockingQueue q = new ArrayBlockingQueue(10);
        for (int i = 0; i < 10; i++) {
            new Thread(new Cooker(i,q)).start();
            new Thread(new Glutton(i,q)).start();
        }
    }
}
