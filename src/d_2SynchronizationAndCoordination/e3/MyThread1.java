package d_2SynchronizationAndCoordination.e3;


public class MyThread1 extends Thread {

    Main.Coordinator coordinator;

    public MyThread1(Main.Coordinator coordinator) {
        this.coordinator = coordinator;
    }

    @Override
    public void run() {
        try {
            coordinator.put();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
