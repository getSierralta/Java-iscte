package d_3LocksAndBarriers.banqueteI;

public class Javali implements Comparable {
    private int id;
    private final Cooker cooker;

    public Javali(Cooker cooker) {
        this.cooker = cooker;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cooker getCooker() {
        return cooker;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
