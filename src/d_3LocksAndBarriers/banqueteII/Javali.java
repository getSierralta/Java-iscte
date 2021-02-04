package d_3LocksAndBarriers.banqueteII;

public class Javali {

    private static int LATEST_ID = 0;
    private int id;
    private final Cooker cooker;

    public Javali(Cooker cooker) {
        id = getAndIncrementLatestId();
        this.cooker = cooker;
    }

    public int getId() {
        return id;
    }
    public synchronized static int getAndIncrementLatestId(){
        return LATEST_ID++;
    }
    public void setId(int id) {
        this.id = id;
    }

    public Cooker getCooker() {
        return cooker;
    }

}
