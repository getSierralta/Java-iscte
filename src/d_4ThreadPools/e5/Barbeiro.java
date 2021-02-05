package d_4ThreadPools.e5;

import java.util.logging.Logger;

public class Barbeiro extends Thread{
    private final Barberia b;
    private final Logger logger = Logger.getLogger(currentThread().getName());

    public Barbeiro(Barberia b) {
        this.b = b;
    }

    @Override
    public void run() {
        while (true){
            try {
                Cliente c = b.receberCliente();
                String msg= "Vou curtar o cabelo do cliente #"+c.getNumber();
                logger.info(msg);
                sleep(2000);
                msg = "Ja cortei o cabelo do cliente #"+c.getNumber();
                logger.info(msg);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
