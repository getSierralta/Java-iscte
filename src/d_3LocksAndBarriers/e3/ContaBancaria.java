package d_3LocksAndBarriers.e3;

import java.util.ArrayList;
import java.util.List;

public class ContaBancaria {

    private int balance = 0;

    public synchronized void deposit(int amount) {
        balance += amount;
    }
    public synchronized int getBalance() {
        return balance;
    }

    public static void main(String[] args) throws InterruptedException {
        ContaBancaria contaBancaria = new ContaBancaria();
        List<Client> clients = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            clients.add(new Client(contaBancaria, i));
        }
        for (int i = 0; i < 10; i++) {
            clients.get(i).start();
        }
        System.out.println("Im going to sleep now");
        Thread.sleep(10000);
        System.out.println("I have Awaken");
        for (int i = 0; i < 10; i++) {
            clients.get(i).interrupt();;
        }
        for (int i = 0; i < 10; i++) {
            clients.get(i).join();;
        }
        System.out.println("Balance: "+contaBancaria.getBalance());
        int balance = 0;
        for (int i = 0; i < 10; i++) {
           balance += clients.get(i).getTotalDeposit();;
        }
        System.out.println("Actual Balance: "+balance);
    }
}
