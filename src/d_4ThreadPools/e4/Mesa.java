package d_4ThreadPools.e4;

import java.util.LinkedList;

public class Mesa{
    public static final int MAX_FRASES = 3;
    private LinkedList<String> listaFrases = new LinkedList<>();


    public synchronized void colocarFrase(String frase) throws InterruptedException {
        while (listaFrases.size() >= MAX_FRASES){
            wait();
        }
        listaFrases.add(frase);
        notifyAll();
    }

    public synchronized String retirarFrase() throws InterruptedException {
        while (listaFrases.isEmpty()){
            wait();
        }
        String frase = listaFrases.removeFirst();
        notifyAll();
        return  frase;
    }
}
