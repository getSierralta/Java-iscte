package d_4ThreadPools.e6;

import java.util.logging.Logger;

public class FabricanteChassis implements Runnable {

    private final Sala s;
    private final int id;
    private final Logger logger = Logger.getLogger(Thread.currentThread().getName());

    public FabricanteChassis(Sala s, int id) {
        this.s = s;
        this.id = id;
    }

    @Override
    public void run() {
        try {
            while (true) {
                s.addChassis(new Carro());
                String msg = "New car made by #" + id;
                logger.info(msg);
            }
        } catch (InterruptedException e) {
           logger.info("Chassis interrupted");
        }
    }
}
