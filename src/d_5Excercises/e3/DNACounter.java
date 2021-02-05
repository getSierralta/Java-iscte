package d_5Excercises.e3;

import java.util.concurrent.Semaphore;

public class DNACounter extends Thread{

    private String dnaSequence;
    private Semaphore semaphore;
    private int countA;
    private int countT;
    private int countC;
    private int countG;

    public DNACounter(String dnaSequence, Semaphore semaphore) {
        this.dnaSequence = dnaSequence;
        this.semaphore = semaphore;
    }

    public String getDnaSequence() {
        return dnaSequence;
    }

    public int getCountA() {
        return countA;
    }

    public int getCountT() {
        return countT;
    }

    public int getCountC() {
        return countC;
    }

    public int getCountG() {
        return countG;
    }

    @Override
    public void run() {
        try {
            semaphore.acquire();
            System.out.println("Vou contar a sequencia: "+ dnaSequence);
            for (int i = 0; i < dnaSequence.length(); i++) {
                switch (dnaSequence.charAt(i)) {
                    case 'A' -> countA++;
                    case 'T' -> countT++;
                    case 'C' -> countC++;
                    case 'G' -> countG++;
                }
            }
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
