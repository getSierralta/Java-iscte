package d_4ThreadPools.e3;

import java.util.Random;

public class Produtor extends Thread {
    private final RecursoPartilhado recursoPartilhado;
    private final int id;

    public Produtor(RecursoPartilhado recursoPartilhado, int id) {
        this.recursoPartilhado = recursoPartilhado;
        this.id = id;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                int temp = new Random().nextInt(30);
                recursoPartilhado.putNumber(temp);
                System.out.println(id + ": P \t" + temp);
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Produtor "+id+" acabou");
    }
}
