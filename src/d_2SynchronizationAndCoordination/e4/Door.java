package d_2SynchronizationAndCoordination.e4;

import java.util.PriorityQueue;

public class Door {

    private final PriorityQueue<Integer> packages = new PriorityQueue<>();
    private int truckInTheDoor = -1;
    private boolean isTruckInDoor = false;

    public Door() {
        for (int i = 0; i < 51; i++) {
            packages.add(i);
        }
    }

    public synchronized void start(int id) {
        if (truckInTheDoor != id && !isTruckInDoor) {
            isTruckInDoor = true;
            truckInTheDoor = id;
        }
    }

    public synchronized void leave() {
        isTruckInDoor = false;
        notifyAll();
    }

    public synchronized int fillTruck(int id) throws InterruptedException {
        if (packages.isEmpty()) {
            return 0;
        } else {
            while (isTruckInDoor && id != truckInTheDoor) {
                wait();
            }
            return packages.poll();
        }
    }

    public static void main(String[] args) {
        Door door = new Door();
        Truck truck = new Truck(door, 0);
        Truck truck1 = new Truck(door, 1);
        Truck truck2 = new Truck(door, 2);
        Truck truck3 = new Truck(door, 3);
        Truck truck4 = new Truck(door, 4);
        truck.start();
        truck1.start();
        truck2.start();
        truck3.start();
        truck4.start();
    }
}
