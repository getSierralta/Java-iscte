package d_2SynchronizationAndCoordination.e3;


public class MyThread2 extends Thread{

    Main.Coordinator coordinator;

    public MyThread2(Main.Coordinator coordinator) {
        this.coordinator = coordinator;
    }

    @Override
    public void run() {
        try {
            coordinator.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
