package d_4ThreadPools.e5;

import java.util.LinkedList;

public class Barberia {

    public static final int MAX_CADEIRAS = 3;
    private final LinkedList<Cliente> listaClientes = new LinkedList<>();

    public synchronized boolean existeLugar(Cliente c) {
        if (listaClientes.size() < MAX_CADEIRAS){
            listaClientes.add(c);
            notifyAll();
            return true;
        }
        return false;
    }

    public synchronized Cliente receberCliente() throws InterruptedException {
        while (listaClientes.isEmpty()){
            wait();
        }
        Cliente c = listaClientes.poll();
        notifyAll();
        return c;
    }

    public static void main(String[] args) {
        Barberia b = new Barberia();
        Barbeiro barbeiro = new Barbeiro(b);
        for (int i = 0; i < 5; i++) {
            new Cliente(b,i).start();
        }
        barbeiro.start();
    }
}
