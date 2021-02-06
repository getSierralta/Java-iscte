package d_5Exercises.e3;

import java.util.LinkedList;
import java.util.concurrent.Semaphore;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        int countA = 0;
        int countT = 0;
        int countC = 0;
        int countG = 0;

        LinkedList<DNACounter> tasks = new LinkedList<>();
        Semaphore semaphore = new Semaphore(10);

        //while (true){
          // String dna = getSequenciaData();
           //if (dna != null){
               //DNACounter counter = new DNACounter(dna, semaphore);
             //  tasks.add(counter);
           //}else {
           //    break;
         // }
        //}


        DNACounter counter = new DNACounter( "ATTTTAAAAGGGCGCGCGCCCCA", semaphore);
        DNACounter counter1 = new DNACounter("AAAC",semaphore);
        DNACounter counter2 = new DNACounter("CCCCCCCCCC",semaphore);

        tasks.add(counter);
        tasks.add(counter1);
        tasks.add(counter2);

        for (DNACounter task : tasks){
            task.start();
        }
        for (DNACounter task : tasks){
            task.join();
        }
        for (DNACounter task : tasks){
            countA += task.getCountA();
            countT += task.getCountT();
            countC += task.getCountC();
            countG += task.getCountG();
        }

        System.out.println("A: "+ countA);
        System.out.println("T: "+ countT);
        System.out.println("C: "+ countC);
        System.out.println("G: "+ countG);
    }

    public static String getSequenciaData(){
        return null;
    }
}
