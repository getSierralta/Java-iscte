package d_3LocksAndBarriers.transportadora;


import static java.lang.Thread.sleep;

public class Encomenda implements Runnable{

    private final Transportadora transportadora;

    public Encomenda(Transportadora transportadora) {
        this.transportadora = transportadora;
    }

    @Override
    public void run() {
        while (true){
            try {
                transportadora.makeEncomendas();
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
