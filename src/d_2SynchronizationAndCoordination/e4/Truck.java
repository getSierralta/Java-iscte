package d_2SynchronizationAndCoordination.e4;


import java.util.logging.Logger;

public class Truck extends Thread {
    private final Door door;
    final int[] packages = new int[5];
    private final int id;
    private final Logger logger = Logger.getLogger(currentThread().getName());

    public Truck(Door door, int id) {
        this.door = door;
        this.id = id;
    }

    private boolean printMsg() {
        StringBuilder msg = new StringBuilder("Truck " + id + " filled with : ");
        int trigger = 0;
        for (int i : packages) {
            msg.append(i).append(" | ");
            if (i == 0) {
                trigger++;
                if (trigger > 3) {
                    return true;
                }
            }
        }
        String message = String.valueOf(msg);
        logger.info(message);
        return false;
    }

    @Override
    public void run() {
        do {
            try {
                door.lockedFillTruck(this);
            } catch (InterruptedException e) {
                return;
            }

        } while (!printMsg());
    }

}
