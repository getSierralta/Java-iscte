package d_4ThreadPools.e5;

import java.util.Random;
import java.util.logging.Logger;

public class Cliente extends Thread{
    private final Barberia b;
    private final int number;
    private final Logger logger = Logger.getLogger(currentThread().getName());

    public Cliente(Barberia b, int number) {
        this.b = b;
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public void run() {
        while (!b.existeLugar(this)){
            try{
                String msg = "Cliente #"+number+" volta mais tarde";
                logger.info(msg);
                sleep(new Random().nextInt(7000)+3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        String msg = "Cliente #"+number+" entrou na barberia";
        logger.info(msg);
    }
}
