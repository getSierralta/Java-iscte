package d_5Excercises.e1;


import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        int valor_max = 100;
        List<PrimeTask> primeTaskList = new LinkedList<>();
        List<Integer> prime = new LinkedList<>();

        ExecutorService pool = Executors.newFixedThreadPool(4);

        int inc = valor_max / 4;

        for (int i = 0; i < valor_max; i += inc) {
            PrimeTask t = new PrimeTask(i + 1, i + inc);
            primeTaskList.add(t);
            pool.submit(t);
        }

        pool.shutdown();
        pool.awaitTermination(78, TimeUnit.SECONDS);

        for (PrimeTask t1 : primeTaskList.toArray(new PrimeTask[0])){
            prime.addAll(t1.getPrimeList());
        }

        Collections.sort(prime);

        for (Integer i: prime) {
            System.out.print(i+"\t");
        }

    }
}
