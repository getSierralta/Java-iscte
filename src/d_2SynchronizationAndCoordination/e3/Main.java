package d_2SynchronizationAndCoordination.e3;

import java.util.logging.Logger;

public class Main {

    public static class Coordinator {

        Logger logger = Logger.getLogger("Coordinator");


        public synchronized void put() throws InterruptedException {
            for (int i = 1; i < 53; i++) {
                String num = String.valueOf(i);
                logger.info(num);
                if (i % 2 == 0){
                    notifyAll();
                    wait();
                }
            }
        }

        public synchronized void get() throws InterruptedException {
            String letters = "ABCDEFJHIJKMNLOPQRSTUVWXTZ";
            for (String letter: letters.split("")) {
                logger.info(letter);
                notifyAll();
                wait();
            }
        }
    }


    public static void main(String[] args) {

        Coordinator coordinator = new Coordinator();

        MyThread1 myThread1 = new MyThread1(coordinator);
        MyThread2 myThread2 = new MyThread2(coordinator);

        myThread1.start();
        myThread2.start();
    }
}
