package d_3LocksAndBarriers.philosopherDinner;

public class Fork {
    private int id;
    private boolean inUse;

    public Fork(int id) {
        this.id = id;
    }


    public synchronized void up(){
        while (inUse){
            try {
                wait();
            }catch (InterruptedException e){}
        }
        inUse = true;
        System.out.println("Fork: "+id+" up");
    }

    public synchronized void down(){
        inUse = false;
        notifyAll();
        System.out.println("Fork: "+id+" down");
    }
}
