package d_4ThreadPools.e1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, InterruptedException {
        //We scan our document
        Scanner scanner = new Scanner(new File("lowercase_books.txt"));
        //We separate all the words from the document
        //And put then inside a list
        LinkedList<String> allTheWords = new LinkedList<>();
        while (scanner.hasNextLine()) {
            allTheWords.addAll(Arrays.asList(scanner.nextLine().replace("[^a-zA-Z0-9\\s]", " ").split(" ")));
        }
        //We separate the list into more tiny list
        //And put all the list in a list of list
        List<List<String>> allTheSeparateWords = new ArrayList<>();

        for (int i = 0; i < allTheWords.size(); i += allTheWords.size()/200) {
            List<String> temp = new ArrayList<>();
            for (int j = i; j < i + 200; j++) {
                if (allTheWords.isEmpty()){
                    break;
                }
                temp.add(allTheWords.pollFirst());
            }
            allTheSeparateWords.add(temp);
        }
        //We create our pool
        ExecutorService executorService = Executors.newFixedThreadPool(6);
        List<Capitalizador> capitalizadors = new ArrayList<>();
        for (int i = 0; i < allTheSeparateWords.size(); i++) {
            Capitalizador temp = new Capitalizador(allTheSeparateWords.get(i), i);
            executorService.execute(temp);
        }
        executorService.shutdown();

    }
}
