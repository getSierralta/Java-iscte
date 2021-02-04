package d_3LocksAndBarriers.philosopherDinnerLocks;

import java.util.PriorityQueue;
import java.util.logging.Logger;

public class Philosopher extends Thread {

    private final Table table;
    private final String name;
    private final PriorityQueue<ChopStick> chopSticks = new PriorityQueue<>();
    private final Logger logger = Logger.getLogger(currentThread().getName());
    private final int id1;
    private int counter = 0;
    private int starveCounter = 0;

    public Philosopher(String name, Table table, int id) {
        this.name = name;
        this.table = table;
        this.id1 = id;
    }

    public int getId1() {
        return id1;
    }

    private void think() {
        try {
            sleep(1000);
            counter += 1000;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private synchronized void eat() throws InterruptedException {
        if (chopSticks.size() >= 2) {
            String msg = name + " is eating";
            logger.info(msg);
            sleep(1000);
            counter = 0;
            starveCounter = 0;
        }
    }

    private void takeChopStick() throws InterruptedException {
        if (chopSticks.size() < 2) {
            table.takeChopStick(this);
        }
    }

    public void setChopStick(ChopStick chopStick) {
        chopSticks.add(chopStick);
        String msg = name + " | Chopstick " + chopStick.getId();
        logger.info(msg);
    }

    private void putChopStick() {
        if (!chopSticks.isEmpty()) {
            table.putChopSticks(chopSticks.poll());
        }
        if (!chopSticks.isEmpty()) {
            table.putChopSticks(chopSticks.poll());
        }
    }

    @Override
    public void run() {
        while (true) {
            try {
                think();
                takeChopStick();
                eat();
                putChopStick();
                if (counter > 12000){
                    String msg = name +" IS STARVING!!!!";
                    starveCounter++;
                    logger.severe(msg);
                }
                if (starveCounter > 5){
                    String msg = name +" DIED";
                    logger.severe(msg);
                    System.exit(-1);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
