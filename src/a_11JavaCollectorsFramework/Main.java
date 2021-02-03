package a_11JavaCollectorsFramework;


import a_10InterfacesComparableAndComparator.Student;

import java.util.*;


public class Main {
    private static final HashMap<Integer, String> meses = new HashMap<>();

    public static void main(String[] args) {

        System.out.println("The month 4 is "+getMes(4));
        Set<Integer> set = new TreeSet<>();
        Integer i = 1;
        set.add(i);
        set.add(i);
        set.add(1);
        System.out.println(set);
        set.add(2);
        System.out.println(set);

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(95,"Juan",10,"M"));
        students.add(new Student(19,"Jose",10,"M"));
        students.add(new Student(54,"Mauro",10,"M"));
        students.add(new Student(68,"Anna",10,"F"));
        students.add(new Student(13,"Pedro",10,"M"));


        StudentsPredicate studentsPredicate = new StudentsPredicate();
        printStudents(students);
        //appliances.removeIf(appliance -> appliance.getBrand().equals(brand));
        students.removeIf(studentsPredicate.isFemale());
        printStudents(students);
        //students.removeIf(studentsPredicate.isMale());
       // printStudents(students);
       // students.sort((Comparator<? super Student>) studentsPredicate.filterAlunos(students,studentsPredicate.isMale()));


    }



    public static void printStudents(ArrayList<Student> students){
        System.out.println("\n");
        for (Student student : students) {
            System.out.println(student);

        }
    }
    static{
        String[] mesesString = {
                "Janeiro", "Fevereiro", "Março", "Abril","Maio","Junho","Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};
        for (int i = 0; i < mesesString.length; i++){
            meses.put(i+1, mesesString[i]);
        }
    }
    public static String getMes(int mes) {
        return meses.get(mes);
    }
}
