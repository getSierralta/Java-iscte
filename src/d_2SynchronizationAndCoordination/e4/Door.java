package d_2SynchronizationAndCoordination.e4;

import java.util.PriorityQueue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Door {

    private final PriorityQueue<Integer> packages = new PriorityQueue<>();
    private final ReentrantLock lock = new ReentrantLock(true);
    private final Condition condition = lock.newCondition();

    public void put(int i) {
        lock.lock();
        try {
            packages.add(i);
            if (i % 5 == 0 && i != 0) {
                condition.signal();
            }
        }finally {
            lock.unlock();
        }
    }

    public void lockedFillTruck(Truck truck) throws InterruptedException {
        try {
            lock.lock();
            while (packages.size() < 5) {
                condition.await();
            }
            for (int i = 0; i < 5; i++) {
                if (packages.isEmpty()) {
                    break;
                }
                truck.packages[i] = packages.poll();
            }
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args)  {
        Door door = new Door();
        Armazen armazen = new Armazen(door);
        armazen.start();
        for (int i = 0; i < 5; i++) {
            Truck truck = new Truck(door, i);
            truck.start();
        }


    }
}
