package d_3LocksAndBarriers.philosopherDinnerLocks;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Logger;

public class Table {

    private final List<ChopStick> chopSticks;
    private final Logger logger = Logger.getLogger(Thread.currentThread().getName());
    private final ReentrantLock lock = new ReentrantLock(true);
    private final Condition condition = lock.newCondition();

    public Table(List<ChopStick> chopSticks) {
        this.chopSticks = chopSticks;
    }

    public void takeChopStick(Philosopher philosopher) throws InterruptedException {
        try {
            lock.lock();
            while (chopSticks.size() < 5) {
                condition.await();
            }
            for (ChopStick chop : chopSticks) {
                if (checkChopStick(chop, philosopher)) {
                    chopSticks.remove(chop);
                    philosopher.setChopStick(chop);
                    break;
                }
            }
            for (ChopStick chop : chopSticks) {
                if (checkChopStick(chop, philosopher)) {
                    chopSticks.remove(chop);
                    philosopher.setChopStick(chop);
                    break;
                }
            }
        } finally {
            lock.unlock();
        }

    }

    private boolean checkChopStick(ChopStick chop, Philosopher philosopher) {
        return (philosopher.getId1() != 0 && philosopher.getId1() != 5) &&
                (chop.getId() == philosopher.getId1() - 1 || chop.getId() == philosopher.getId1() + 1) ||
                (philosopher.getId1() == 0 && (chop.getId() == 1 || chop.getId() == 6)) ||
                (philosopher.getId1() == 5 && (chop.getId() == 1 || chop.getId() == 5));
    }

    public void putChopSticks(ChopStick chopStick) {
        lock.lock();
        try {
            if (!chopSticks.contains(chopStick)) {
                chopSticks.add(chopStick);
                String msg = "Chopsticks back: " + chopStick.getId();
                logger.info(msg);
            }
            condition.signal();
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        List<ChopStick> chopSticks = new ArrayList<>();
        for (int i = 1; i < 6; i++) {
            chopSticks.add(new ChopStick(i));
        }
        Table table = new Table(chopSticks);

        String[] philosopherName = {"Pythagoras", "Plato", "Aristotle", "Lucretius", "Epicurus"};

        for (int i = 0; i < 5; i++) {
            Philosopher philosopher = new Philosopher(philosopherName[i] + " " + i + " ", table, i);
            philosopher.start();
        }
    }
}
