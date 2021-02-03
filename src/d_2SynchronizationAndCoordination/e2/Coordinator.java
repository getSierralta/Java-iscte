package d_2SynchronizationAndCoordination.e2;

import java.util.logging.Logger;

public class Coordinator {

    private int dish = 0;
    Logger logger = Logger.getLogger("Coordinator");
    String msg = "Amount of dishes to be served: "+dish;

    public synchronized void putDish(){
        dish++;
        notifyAll();
        logger.info(msg);
    }

    public synchronized void getDish() throws InterruptedException {
        wait();
        logger.info(msg);
    }


    public static void main(String[] args) {
        Coordinator coordinator = new Coordinator();
        Chefe chefe = new Chefe(coordinator);
        Employee employee = new Employee(coordinator);
        chefe.start();
        employee.start();
    }

}
