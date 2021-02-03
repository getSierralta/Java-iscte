package d_2SynchronizationAndCoordination.e1;

import java.util.logging.Logger;

public class MyThread extends Thread{

    Contador contador;

    public MyThread(Contador contador) {
        this.contador = contador;
    }

    @Override
    public void run() {
        Logger logger = Logger.getLogger(currentThread().getName());
        for (int i = 0; i < 20; i++) {
            contador.incrementar();
            String msg = currentThread().getName()+": "+contador.consulta();
            logger.info(msg);
        }
    }

    public static void main(String[] args) {
       Contador contador = new Contador();
       Thread myThread01 = new MyThread(contador);
       Thread myThread02 = new MyThread(contador);
       Thread myThread03 = new MyThread(contador);
       Thread myThread04 = new MyThread(contador);

       myThread01.start();
       myThread02.start();
       myThread03.start();
       myThread04.start();
    }
}
