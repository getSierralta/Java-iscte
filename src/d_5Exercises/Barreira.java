package d_5Exercises;

public class Barreira {
    private static final int MAX = 3;
    public int countIn = 0;
    public int countOut = 0;

    public synchronized void u1() {
        try {
            countIn++;
            while (countIn < MAX) {
                wait();
            }
            notifyAll();
        } catch (InterruptedException i) {
        }
        countOut++;
        if (countOut == MAX) {
            countIn = 0;
            countOut = 0;
        }
    }

    public static class SleepMessages extends Thread {
        private Barreira u;
        private long startTime;

        public SleepMessages(String name, Barreira u, long startTime) {
            setName(name);
            this.startTime = startTime;
            this.u = u;
        }

        public void run() {
            String importantInfo[] = {"Cold", "Hot"};
            for (int i = 0; i < importantInfo.length; i++) {
                u.u1();
                try {
                    sleep(3000);
                    System.out.println(getName() + "-" + importantInfo[i] + "-" +
                            (System.currentTimeMillis() - startTime) / 1000 + "s");
                } catch (InterruptedException e) {
                }
            }
        }

        public static void main(String args[]) throws InterruptedException {
            long sTime = System.currentTimeMillis();
            Barreira u = new Barreira();
            Thread t1 = new SleepMessages("t1", u, sTime);
            Thread t2 = new SleepMessages("t2", u, sTime);
            System.out.println("Here they go!...");
            t1.start();
            t2.start();
            sleep(1000);
            t1.interrupt();
            sleep(1000);
            u.u1();
            sleep(3000);
            u.u1();
            sleep(1000);
            t2.interrupt();
            t1.join();
            t2.join();
            System.out.println("Main - Main done - " +
                    (System.currentTimeMillis() - sTime) / 1000 + "s");
        }
    }

}