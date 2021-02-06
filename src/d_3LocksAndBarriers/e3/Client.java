package d_3LocksAndBarriers.e3;

import java.util.Random;

public class Client extends Thread {

    private int totalDeposit = 0;
    private ContaBancaria contaBancaria;
    private int id;

    public Client(ContaBancaria contaBancaria, int id) {
        this.contaBancaria = contaBancaria;
        this.id = id;
    }

    public int getTotalDeposit() {
        return totalDeposit;
    }

    @Override
    public void run() {
        System.out.println("I started #" + id);
        while (!currentThread().isInterrupted()) {
            int temp = new Random().nextInt(200);
            contaBancaria.deposit(temp);
            totalDeposit += temp;
        }
        System.out.println("I been interrupted #" + id);
    }
}
