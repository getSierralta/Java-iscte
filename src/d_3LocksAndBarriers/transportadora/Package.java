package d_3LocksAndBarriers.transportadora;

public class Package {

    private static int LATEST_ID = 0;
    private final int id;
    private final Client client;

    public Package(Client client) {
        this.id = getAndIncrementLatestId();
        this.client = client;
    }

    public int getId() {
        return id;
    }

    public static synchronized int getAndIncrementLatestId(){
        return LATEST_ID++;
    }

    public Client getClient() {
        return client;
    }

}
