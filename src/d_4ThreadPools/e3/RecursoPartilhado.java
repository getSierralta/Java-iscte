package d_4ThreadPools.e3;

import java.util.ArrayList;
import java.util.List;

public class RecursoPartilhado {

    private List<Integer> numbers = new ArrayList<>();

    public synchronized void putNumber(int number) throws InterruptedException {
        while (numbers.size() >= 2) {
            wait();
        }
        numbers.add(number);
        notifyAll();
    }

    public synchronized List<Integer> getNumber() throws InterruptedException {
        while (numbers.size() < 2) {
            wait();
        }
        List<Integer> temp = new ArrayList<>(numbers);
        numbers.clear();
        notifyAll();
        return temp;
    }

    public static void main(String[] args) {
        RecursoPartilhado recursoPartilhado = new RecursoPartilhado();
        for (int i = 0; i < 5; i++) {
            new Produtor(recursoPartilhado, i).start();
        }
        for (int i = 0; i < 5; i++) {
            new Consumidor(recursoPartilhado, i).start();
        }
    }
}
