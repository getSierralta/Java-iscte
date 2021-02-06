package d_4ThreadPools.e2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(6);
        List<Bolas> bolas = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            Bolas temp = new Bolas(i);
            bolas.add(temp);
            service.execute(temp);
        }

        service.shutdown();
        while (!service.isTerminated()) {   }

        int max = 0;
        int winnerB = 0;
        for (Bolas b : bolas) {
            if (max < b.getNumber()){
                max = b.getNumber();
                winnerB = b.getId();
            }
        }
        System.out.println(winnerB+" is the Winner! ball #"+max);


    }
}
