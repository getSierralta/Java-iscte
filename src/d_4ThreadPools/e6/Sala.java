package d_4ThreadPools.e6;

import java.util.logging.Logger;

import static java.lang.Thread.currentThread;
import static java.lang.Thread.sleep;

public class Sala {

    private final Logger logger = Logger.getLogger("Sala");
    private Carro carro;
    private int carrosCriados = 0;

    public synchronized void addChassis(Carro c) throws InterruptedException {
        while (carro != null) {
            wait();
        }
        this.carro = c;
        carro.setChassisInstalado(true);
        sleep(1000);
        logger.info("I put the chassis in production");
        notifyAll();
    }

    public synchronized void putRodas() throws InterruptedException {
        while(carro == null || !carro.isChassisInstalado() || carro.isRodasInstaladas()) {
            wait();
        }
        sleep(1000);
        carro.setRodasInstaladas(true);
        logger.info("I put the wheels in the car");
        notifyAll();
    }

    public synchronized void putMotor() throws InterruptedException {
        while(carro == null || !carro.isRodasInstaladas()){
            wait();
        }
        carro.setMotorInstalado(true);
        sleep(1000);
        logger.info("I put the motor");
        carrosCriados++;
        carro = null;
        notifyAll();
    }
    public int getCarros() {
        return carrosCriados;
    }

    public static void main(String[] args) throws InterruptedException {

        Sala s = new Sala();

        Thread thread1 = new Thread(new FabricanteChassis(s,1));
        Thread thread2 = new Thread(new FabricanteChassis(s,2));

        Thread thread3 = new Thread(new FabricanteRodas(s,1));
        Thread thread4 = new Thread(new FabricanteRodas(s,2));

        Thread thread5 = new Thread(new FabricanteMotor(s,1));
        Thread thread6 = new Thread(new FabricanteMotor(s,2));
        Thread thread7 = new Thread(new FabricanteMotor(s,3));
        Thread thread8 = new Thread(new FabricanteMotor(s,4));

        thread1.start();
        thread2.start();

        thread3.start();
        thread4.start();

        thread5.start();
        thread6.start();
        thread7.start();
        thread8.start();

        sleep(10000);

        thread1.interrupt();
        thread2.interrupt();

        thread3.interrupt();
        thread4.interrupt();

        thread5.interrupt();
        thread6.interrupt();
        thread7.interrupt();
        thread8.interrupt();


        thread1.join();
        thread2.join();

        thread3.join();
        thread4.join();

        thread5.join();
        thread6.join();
        thread7.join();
        thread8.join();

        System.out.println("Criei "+s.getCarros()+" carros");
    }


}
