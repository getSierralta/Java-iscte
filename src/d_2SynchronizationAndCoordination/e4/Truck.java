package d_2SynchronizationAndCoordination.e4;

import java.util.logging.Logger;

public class Truck extends Thread {
    private final Door door;
    private final int[] packages = new int[5];
    private final int id;

    public Truck(Door door, int id) {
        this.door = door;
        this.id = id;
    }

    private boolean printMsg() {
        StringBuilder msg = new StringBuilder("Truck "+id+" filled with : ");
        int trigger = 0;
        for (int i : packages) {
            msg.append(i).append(" ");
            if (i == 0) {
                trigger++;
                if (trigger > 1) {
                    return true;
                }
            }
        }
        String message = String.valueOf(msg);
        Logger logger = Logger.getLogger(currentThread().getName());
        logger.info(message);
        return false;
    }

    @Override
    public void run() {
        do {
            door.start(id);
            for (int i = 0; i < 5; i++) {
                try {
                    packages[i] = door.fillTruck(id);
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            door.leave();
        } while (!printMsg());
    }

}
