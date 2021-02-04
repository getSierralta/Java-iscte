package d_3LocksAndBarriers.serverRoom;

import java.util.Random;

import static java.lang.Thread.sleep;

public class Pessoa implements Runnable{

    private final Setup setup;
    private final int id;

    public Pessoa(Setup setup, int id) {
        this.setup = setup;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public void run() {
        while (true){
            try {
                setup.accessServer(this);
                sleep(new Random().nextInt(9000 - 5000)+5000);
                setup.leaveServer(this);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
