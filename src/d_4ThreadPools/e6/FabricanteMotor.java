package d_4ThreadPools.e6;

import java.util.logging.Logger;

public class FabricanteMotor implements Runnable {

    private Sala s;
    private int id;
    private final Logger logger = Logger.getLogger(Thread.currentThread().getName());

    public FabricanteMotor(Sala s, int id) {
        this.s = s;
        this.id = id;
    }

    @Override
    public void run() {
        try {
            while (true) {
                s.putMotor();
                String msg = "Motor put by #" + id;
                logger.info(msg);

            }
        } catch (InterruptedException e) {
           logger.info("Motor interrupted");
        }

    }
}
