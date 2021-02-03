package d_2SynchronizationAndCoordination.e4;

import java.util.logging.Logger;

public class Armazen extends Thread {

    private final Door door;

    public Armazen(Door door) {
        this.door = door;
    }

    @Override
    public void run() {
        Logger logger = Logger.getLogger(currentThread().getName());
        for (int i = 0; i < 50; i++) {
            door.put(i);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
               return;
            }
            String msg = i + " package put";
            logger.info(msg);
        }

    }
}
