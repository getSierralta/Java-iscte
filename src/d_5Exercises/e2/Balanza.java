package d_5Exercises.e2;

public class Balanza {

    private double MAX_VALUE = 12.5;
    private double value;

    public synchronized void colocaOuro(double peso) throws InterruptedException {
        while (value + peso >= MAX_VALUE ){
            wait();
        }
        value += peso;
        System.out.println("Peso na balanca é: "+ value);
        notifyAll();
    }

    public synchronized void retirarOuro() throws InterruptedException {
        while (value < MAX_VALUE){
            wait();
        }
        value = 0;
        notifyAll();
    }
}
