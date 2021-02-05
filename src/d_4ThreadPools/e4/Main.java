package d_4ThreadPools.e4;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Mesa mesa = new Mesa();
        Macaco[] macacos = new Macaco[10];
        Shakespeare shakespeare = new Shakespeare(mesa, 1);
        for (int i = 0; i < macacos.length; i++) {
            macacos[i] = new Macaco(mesa, i);
        }
        for (int i = 0; i < macacos.length; i++) {
            macacos[i].start();
        }

        shakespeare.start();
        shakespeare.join();

        for (int i = 0; i < macacos.length; i++) {
            macacos[i].interrupt();
        }
        System.out.println("Terminei");
    }
}
