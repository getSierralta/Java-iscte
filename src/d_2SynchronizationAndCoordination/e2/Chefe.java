package d_2SynchronizationAndCoordination.e2;

import java.util.logging.Logger;

public class Chefe extends Thread{

    Coordinator coordinator;

    public Chefe(Coordinator coordinator) {
        this.coordinator = coordinator;
    }

    @Override
    public void run() {
        Logger logger = Logger.getLogger(currentThread().getName());
        for (int i = 0; i < 10; i++) {
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            coordinator.putDish();
            logger.info("Dish made :)");
        }
    }
}
