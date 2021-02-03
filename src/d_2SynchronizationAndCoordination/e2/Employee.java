package d_2SynchronizationAndCoordination.e2;

import java.util.logging.Logger;

public class Employee extends Thread{

    Coordinator coordinator;

    public Employee(Coordinator coordinator) {
        this.coordinator = coordinator;
    }

    @Override
    public void run() {
        Logger logger = Logger.getLogger(currentThread().getName());
        for (int i = 0; i < 10; i++) {
            try {
                coordinator.getDish();
                String msg = "Dish taken :) "+i+1;
                logger.info(msg);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
