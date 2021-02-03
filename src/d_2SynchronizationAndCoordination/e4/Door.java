package d_2SynchronizationAndCoordination.e4;

import java.util.PriorityQueue;
import java.util.concurrent.locks.ReentrantLock;

public class Door {

    private final PriorityQueue<Integer> packages = new PriorityQueue<>();
    private  ReentrantLock lock = new ReentrantLock();

    public synchronized void put(int i) {
        packages.add(i);
        notifyAll();
    }

    public synchronized int fillTruck() throws InterruptedException {
        while (packages.size() < 5) {
            wait();
        }
        return packages.poll();
    }

    public synchronized void lockedFillTruck(Truck truck) throws InterruptedException {
        while (packages.size() < 5) {
            wait();
        }
        lock.lock();
        for (int i = 0; i < 5; i++) {
            if (packages.isEmpty()) {
                break;
            }
            truck.packages[i] = packages.poll();
        }
        lock.unlock();
    }




    public static void main(String[] args) {
        Door door = new Door();
        Armazen armazen = new Armazen(door);
        Truck truck = new Truck(door, 0);
        Truck truck1 = new Truck(door, 1);
        Truck truck2 = new Truck(door, 2);
        Truck truck3 = new Truck(door, 3);
        Truck truck4 = new Truck(door, 4);
        armazen.start();
        truck.start();
        truck1.start();
        truck2.start();
        truck3.start();
        truck4.start();
    }
}
