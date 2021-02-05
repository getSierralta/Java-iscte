package d_4ThreadPools.e6;

import java.util.logging.Logger;

public class FabricanteRodas implements Runnable {
    private Sala s;
    private int id;
    private final Logger logger = Logger.getLogger(Thread.currentThread().getName());

    public FabricanteRodas(Sala s, int id) {
        this.s = s;
        this.id = id;
    }

    @Override
    public void run() {
        try {
            while (true) {
                s.putRodas();
                String msg = "Rodas put by #" + id;
                logger.info(msg);
            }
        } catch (InterruptedException e) {
            logger.info("Rodas interrupted");
        }

    }
}
