package d_4ThreadPools.e1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolTest {
    public static void main(String[] args) {

        ExecutorService pool = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

        try {
            Scanner scanner = new Scanner(new File("lowercase_books.txt"));

            //String Builder
            StringBuilder todasPalavras = new StringBuilder();
            while (scanner.hasNextLine()) {
                todasPalavras.append(scanner.nextLine());
            }

            //Todas as palavras
            String[] palavras = todasPalavras.toString().split(" ");
            int numTotalThreads = (palavras.length / 200) + 1;
            Runnable[] runnables = new Runnable[numTotalThreads];
            int palavraAtual = 0;

            String[] resultado = new String[todasPalavras.length()];

            for (int i = 0; i < numTotalThreads; i++) {
                String[] palavrasSeparadas = new String[200];
                int num = 200;
                if (palavras.length < (palavraAtual + 200)) {
                    num = palavras.length - palavraAtual;
                }
                // 6600 -> [6600 -> 6787]
                for (int j = palavraAtual; i < palavraAtual + 200; j++) {
                    palavrasSeparadas[j - palavraAtual] = palavras[j];
                }
                //pool.submit(new Capitalizador(i, palavrasSeparadas, resultado));

            }
            pool.awaitTermination(1000, TimeUnit.SECONDS);
        } catch (FileNotFoundException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Resultado{
    private  String[] resultado;
    public Resultado(int num){
        resultado = new String[num];
    }

    public synchronized  void setWord(int indice, String palavra){
        resultado[indice] = palavra;
    }
    //public String getResult(){
   //     return ;// String.join(" ", );
   // }
}

class Capitalizador implements Runnable {

    private String[] resultado;
    private int finalI;
    private String[] palavrasSeparadas;

    public Capitalizador(Resultado resultado, int finalI, String[] palavrasSeparadas) {
        //this.resultado = resultado;
        this.finalI = finalI;
        this.palavrasSeparadas = palavrasSeparadas;
    }

    @Override
    public void run() {
        int indiceAtual = finalI * 200;
        for (String palavra : palavrasSeparadas) {
            String palavraCapitalizada = palavra.substring(0, 1) + palavra.substring(1);
           // resultado.setWord
            resultado[indiceAtual] = palavraCapitalizada;
            indiceAtual++;
        }
    }
}

