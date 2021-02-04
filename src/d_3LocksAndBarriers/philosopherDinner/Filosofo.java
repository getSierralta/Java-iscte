package d_3LocksAndBarriers.philosopherDinner;



public class Filosofo extends Thread{

    private int id, times_eat = 0;
    private Fork leftFork, rightFork;

    public Filosofo(int id,  Fork leftFork, Fork rightFork) {
        this.id = id;
        this.leftFork = leftFork;
        this.rightFork = rightFork;
    }

    private void thinking() throws InterruptedException {
        sleep(1000);
    }

    private void eating() throws InterruptedException {
        sleep(1000);
    }

    public void run(){
        try {
            while (times_eat != 5){
                thinking();
                leftFork.up();
                rightFork.up();
                eating();
                leftFork.down();
                rightFork.down();
            }
        }catch (InterruptedException e){}
    }

    public static void main(String[] args) {
        Fork f1 = new Fork(1);
        Fork f2 = new Fork(2);
        Fork f3 = new Fork(3);
        Fork f4 = new Fork(4);
        Fork f5 = new Fork(5);

        new Filosofo(1, f1,f2).start();
        new Filosofo(2, f2,f3).start();
        new Filosofo(3, f3,f4).start();
        new Filosofo(4, f4,f5).start();
        new Filosofo(5, f5,f1).start();
    }
}
