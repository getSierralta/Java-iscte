package aula14Ficheiros;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Map {

    public void printMap(String pathName){

        File file = new File(pathName);
        ArrayList<String> list = new ArrayList<>();
        try{
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()){
                String[] split = scanner.nextLine().split("");
                Collections.addAll(list, split);
                list.add(";");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        for (String string: list) {
            if (string.equals(";")){
                string = "\n";

            }else if (string.equals("#")){
                string = "W";
            }else{
                string = " ";
            }

            System.out.print(string);
        }
    }

    public static void main(String[] args) {
        Map map = new Map();
        map.printMap("map.txt");
        map.printMap("map2.txt");

    }
}

