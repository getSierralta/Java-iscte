package d_5Exercises.e1;

import java.util.LinkedList;

public class PrimeTask implements Runnable{

    private int start;
    private int end;
    private  LinkedList<Integer> primeList = new LinkedList<>();

    public PrimeTask(int start, int end) {
        this.start = start;
        this.end = end;
        System.out.println("Vou validar entre "+start+" e "+end);
    }

    public LinkedList<Integer> getPrimeList() {
        return primeList;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            boolean isPrime = true;
            for (int aux = 2; aux < i; aux++){
                if(i % aux == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                primeList.add(i);
            }
        }
    }
}
