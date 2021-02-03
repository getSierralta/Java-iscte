package a_14ReadingAndWritingFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        try{
            Scanner scanner = new Scanner(new File("people.txt"));
            while (scanner.hasNextLine()){
                String personString = scanner.nextLine();
                Person person = new Person(personString);
                people.add(person);

            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("The file doesn't exits");
            e.printStackTrace();
        }
        for (Person person: people){
            System.out.println(person);
        }

        Scanner keyboard = new Scanner(System.in);
        System.out.println("What's your name?");
        String name = keyboard.nextLine();
        System.out.println("What's your age?");
        Integer age = null;
        while (age == null){
            try{
                age = keyboard.nextInt();
            }catch (NumberFormatException e){
                System.out.println("Invalid age! Try again!");
                keyboard.nextLine();
            }
        }
        try {
            File file = new File("person2.txt");
            ArrayList<String> linesInFile = new ArrayList<>();
            linesInFile.add(name+":"+age);
            if (file.exists()){
                Scanner fileScanner = new Scanner(file);
                while (fileScanner.hasNextLine()){
                    linesInFile.add(fileScanner.nextLine());
                }
            }

            PrintWriter printWriter = new PrintWriter(
                    new File("person.txt"));
            for (String line: linesInFile){
                printWriter.println(line);
            }
            printWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
