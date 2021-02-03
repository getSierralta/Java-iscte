package d_2SynchronizationAndCoordination.e4;

public class Armazen extends Thread {

    private final Door door;

    public Armazen(Door door) {
        this.door = door;
    }

    @Override
    public void run() {
        for (int i = 0; i < 51; i++) {
            door.put(i);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
               return;
            }
        }

    }
}
