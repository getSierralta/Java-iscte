package d_3LocksAndBarriers.philosopherDinnerLocks;

public class ChopStick implements Comparable{
    private final int id;

    public ChopStick(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
