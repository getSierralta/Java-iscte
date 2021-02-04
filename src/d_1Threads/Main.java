package d_1Threads;

import java.util.ArrayList;
import java.util.logging.Logger;

public class Main {
    //Pretende-se desenvolver uma aplicação que permite determinar qual o
    //dígito que existe em maior número num conjunto de Strings. A aplicação
    //deve contar o número de vezes que cada dígito aparece na String.
    //Exemplo de Strings: “4 3 7 3 58 7 3 45 7 4 6 3 1 2 1 2 4 5 35 87 4 32 6 7 8”, “4 63
    //        645 3 7 4 57345 2 1 3 4 2 4”, “5 7 89 42 5 7 4 6 4 3 3 6 5 3 67 5”
    //Por questões de eficiência, a contagem dos dígitos deve ser implementada
    //através de threads (uma thread para cada String). Cada thread representa
    //uma tarefa de contagem. Assim, se existirem 3 String, vão existir 3 threads.
    //        No final das pesquisas, o método main() deverá devolver o dígito que existe
    //em maior número. Dica: crie métodos adicionais nas tarefas (threads).
    public static class Thread1 extends Thread {
        private String string;

        public Thread1(String string) {
            this.string = string;
        }

        @Override
        public void run() {
            Logger logger = Logger.getLogger(currentThread().getName());
            String[] split = string.replace(" ", "").split("");
            int lastCount =  0;
            String lastCharacter = "";
            for (String character : split) {
                int container = 1;
                for (String character2 : split) {
                    if (character.equals(character2)) {
                        container++;
                    }
                }
                if (container > lastCount){
                    lastCount = container;
                    lastCharacter = character;
                }
            }
            String msg = currentThread().getName()+" "+lastCharacter + ": " + lastCount + " times.";
            logger.info(msg);
        }
    }

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("4 3 7 3 58 7 3 45 7 4 6 3 1 2 1 2 4 5 35 87 4 32 6 7 8");
        strings.add(" 63 645 3 7 4 57345 2 1 3 4 2 4");
        strings.add("5 7 89 42 5 7 4 6 4 3 3 6 5 3 67 5");

        for (String string: strings) {
            Thread1 thread = new Thread1(string);
            thread.start();
        }
    }
}
