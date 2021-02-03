package d_3LocksAndBarriers.philosopherDinner;

public class Fork {
    private int id;
    private boolean inUse;

    public Fork(int id){
        this.id = id;
        inUse = false;
    }

    public synchronized void up(){
        while (inUse){
            System.out.println("Going ");
        }
    }

}
