package d_4ThreadPools.e1;


import java.util.ArrayList;
import java.util.List;

public class Capitalizador implements Runnable {
    private List<String> strings;
    private final int id;
    private final List<String> capitalizedList = new ArrayList<>();

    public Capitalizador(List<String> strings, int id) {
        this.strings = strings;
        this.id = id;
    }

    private void printEverything() {
        System.out.println("#"+id+" \t");
        for (String s: capitalizedList) {
            System.out.print(s+" ");
        }
    }



    @Override
    public void run() {
        if (!strings.isEmpty()) {
            for (String s : strings) {
                if (s != null) {
                    String[] temp = s.replace(" ", "").split("");
                    temp[0] = temp[0].toUpperCase();
                    StringBuilder newWord = new StringBuilder();
                    for (String c : temp) {
                        newWord.append(c);
                    }
                    capitalizedList.add(newWord.toString());
                }
            }
            System.out.println("I have finish capitalizing #"+id +" "+ capitalizedList.size()+" words");
        } else {
            System.out.println("List of Strings is empty #" + id);
        }


    }


}
