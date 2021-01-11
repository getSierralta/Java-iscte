package aula6Objetos.classRoom;

public class Main {

    public static void main(String[] args) {


        Student maxwell = new Student(1,"Maxwell");
        maxwell.setClass('A',1);

        Student conner = new Student(2,"Conner");
        conner.setClass('A',1);

        Student farnham = new Student(3,"Farnham");
        farnham.setClass('A',1);

        Student alan = new Student(4,"Alan");
        alan.setClass('A',1);

        Student harley = new Student(5,"Harley");
        harley.setClass('B',2);
        Student erik = new Student(6,"Erik");
        erik.setClass('B',2);
        Student robbie = new Student(9,"Robbie");
        robbie.setClass('C',3);
        Student omar = new Student(10,"Omar");
        omar.setClass('C',3);
        Student oliver = new Student(11,"Oliver");
        oliver.setClass('C',3);
        Student julia = new Student(12,"Julia");
        julia.setClass('C',3);
        Student jeremiah = new Student(7,"Jeremiah");
        jeremiah.setClass('C',3);
        Student charles = new Student(8,"Charles");
        charles.setClass('C',3);


        Student[] studentsJava = new Student[4];

        studentsJava[0] = maxwell;
        studentsJava[1] = conner;
        studentsJava[2] = farnham;
        studentsJava[3] = alan;

        Student[] studentsC = new Student[4];

        studentsC[0] = harley;
        studentsC[1] = erik;


        Student[] studentsPython = new Student[6];

        studentsPython[0] = robbie;
        studentsPython[1] = omar;
        studentsPython[2] = oliver;
        studentsPython[3] = julia;
        studentsPython[4] = jeremiah;
        studentsPython[5] = charles;


        Room javaR = new Room('A',4,1,studentsJava);
        Room cR = new Room('B',4,2,studentsC);
        Room pythonR = new Room('C',4,3,studentsPython);


        javaR.printStudents();
        cR.printStudents();
        cR.addStudent(jeremiah);
        cR.addStudent(charles);
        cR.printStudents();
        cR.deleteStudent(5);
        cR.printStudents();
        cR.addStudent(robbie);
        cR.printStudents();
        cR.deleteStudent(6);
        cR.printStudents();
        javaR.deleteStudent(1);
        javaR.printStudents();
        javaR.addStudent(erik);
        javaR.printStudents();
        cR.addStudent(maxwell);
        cR.printStudents();

    }
}
