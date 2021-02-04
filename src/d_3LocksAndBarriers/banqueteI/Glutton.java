package d_3LocksAndBarriers.banqueteI;

import java.util.Random;

public class Glutton extends Thread{
    private final Table table;
    private final Random random = new Random();
    private final int id1;

    public Glutton(int id, Table table) {
        this.id1 = id;
        this.table = table;
    }

    public int getId1() {
        return id1;
    }

    @Override
    public void run() {
        while (true){
            try {
                table.takeJavali(this);
                sleep(random.nextInt(5000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}