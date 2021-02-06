package d_3LocksAndBarriers;

import java.util.LinkedList;
import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Barreira extends Thread{

    private  final CyclicBarrier barrier;
    private final int id;


    public Barreira(CyclicBarrier barrier, int id) {
        this.barrier = barrier;
        this.id = id;
    }

    @Override
    public void run() {
        while (!currentThread().isInterrupted()){
            try {
                sleep(new Random().nextInt(5000)+1000);
                System.out.println("Trying to pass the barrier #"+id);
                barrier.await();
                sleep(1000);
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
            if (barrier.getParties() >= barrier.getNumberWaiting()){
                System.out.println("I passed the barrier #"+id);
            }
            currentThread().interrupt();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        CyclicBarrier barrier = new CyclicBarrier(5);
        LinkedList<Barreira> barreiras = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            Barreira b = new Barreira(barrier, i);
            barreiras.add(b);
            b.start();
        }
        for (int i = 0; i < 5; i++) {
           barreiras.get(i).join();
        }
        System.out.println("Main finish");


    }
}
