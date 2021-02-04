package d_3LocksAndBarriers.serverRoom;

import java.util.concurrent.Semaphore;
import java.util.logging.Logger;

public class Setup {

    private final Semaphore semaphore;
    private final Logger logger = Logger.getLogger("Setup");

    public Setup(int max, Boolean fair) {
        semaphore = new Semaphore(max, fair);
    }

    public void accessServer(Pessoa pessoa) throws InterruptedException {
        semaphore.acquire();
        String msg = "Person #"+pessoa.getId()+" enter the server Room. " +
                "\t"+semaphore.availablePermits()+ " available permits.";
        logger.info(msg);
    }

    public void leaveServer(Pessoa pessoa) {
        semaphore.release();
        String msg = pessoa.getId()+" Leave the server Room. " +
                "\t"+semaphore.availablePermits()+ " available permits.";
        logger.info(msg);
    }

    public static void main(String[] args) {
        Setup setup = new Setup(2, true);
        for (int i = 0; i < 3; i++) {
            new Thread(new Pessoa(setup,i+1)).start();
        }

    }


}
