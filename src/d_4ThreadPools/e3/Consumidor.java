package d_4ThreadPools.e3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Consumidor extends Thread {

    private final RecursoPartilhado recursoPartilhado;
    private final int id;

    public Consumidor(RecursoPartilhado recursoPartilhado, int id) {
        this.recursoPartilhado = recursoPartilhado;
        this.id = id;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                List<Integer> temp;
                temp = recursoPartilhado.getNumber();
                if (temp.size() > 1) {
                    System.out.println(id + ": C \t" + temp.get(0) + temp.get(1));
                } else {
                    System.out.println(id + " C \t error");
                }
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Consumidor "+id+" acabou");
    }
}
