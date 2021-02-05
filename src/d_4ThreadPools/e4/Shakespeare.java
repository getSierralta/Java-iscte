package d_4ThreadPools.e4;

import java.util.LinkedList;

public class Shakespeare extends Thread {

    private LinkedList<String> livro = new LinkedList<>();
    private int FRASES_LIVRO = 100;
    private String teste = "o romeu";
    private Mesa mesa;
    private int id;

    public Shakespeare(Mesa mesa, int id) {
        this.mesa = mesa;
        this.id = id;
    }

    @Override
    public void run() {
        while ( livro.size() < FRASES_LIVRO){
            try {
                String frase = mesa.retirarFrase();
                if(frase.contains(teste)){
                    System.out.println(frase);
                    livro.add(frase + "\n");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(livro);
    }
}
