package d_3LocksAndBarriers.banqueteI;

import java.util.PriorityQueue;
import java.util.logging.Logger;

public class Table {

    private PriorityQueue<Javali> javalis = new PriorityQueue<Javali>();
    private int counter = 0;
    private final Logger logger = Logger.getLogger("Table");

    public synchronized void putJavali(Javali javali) throws InterruptedException {
        while (javalis.size() == 10){
            wait();
        }
        counter++;
        javali.setId(counter);
        javalis.add(javali);
        notifyAll();
        String msg = "Javali #"+counter+" has been put in the table by cooker #"+javali.getCooker().getId1()+"\n There's "+javalis.size()+" javalis in the table";
        logger.info(msg);
    }
    public synchronized void takeJavali(Glutton glutton) throws InterruptedException {
        while (javalis.isEmpty()){
           wait();
        }
        String msg = "Javali #"+javalis.peek().getId()+" taken by glutton #"+glutton.getId1();
        javalis.poll();
        notifyAll();
        logger.info(msg);
    }

    public static void main(String[] args) {
        Table table = new Table();
        for (int i = 0; i < 10; i++) {
            new Cooker(i,table).start();
        }
        for (int i = 0; i < 5; i++) {
            new Glutton(i, table).start();
        }
    }
}
