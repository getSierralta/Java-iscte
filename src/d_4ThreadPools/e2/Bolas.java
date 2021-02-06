package d_4ThreadPools.e2;

import java.util.Random;

public class Bolas implements Runnable {

    private int number = 0;
    private final int id;

    public Bolas(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public void run() {
        for (int i = 0; i < 35; i++) {
            try {
                Thread.sleep(1000);
                number += new Random().nextInt(100);
                System.out.println(id+":\t"+number);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(id+": I have Finished!");
    }
}
