package A_6Objects.classRoom;

public class Room {

    //Each room contains a blockName, a number, a capacity of students and an array with all the students of that room
    private final char blockName;
    private final int number;
    private final int capacity;
    private Student[] students;

    public Room(char blockName, int capacity, int number, Student[] students){
        this.blockName = blockName;
        this.capacity = capacity;
        this.number = number;
        //We call the setStudents function so we can verify the array they are sending us
        setStudents(students);

    }

    /**
     * It checks if the students doesn't overflow the capacity
     * it fills the students array with the new students
     * it prints whether the students were added or not
     * @param students array of students
     */
    public void setStudents(Student[] students){
        if (students.length > capacity){
            System.out.println("Error, the students overflow the capacity of the class room "+blockName+number+"!");
        }else{
            this.students = new Student[this.capacity];
            System.arraycopy(students, 0, this.students, 0, students.length);
            System.out.println("Students added to the class room "+blockName+number+"!");
        }

    }

    //It prints all the students inside a class room
    public void printStudents(){
        for (Student student : students) {
            if (student == null) {
                System.out.println("Free space \n");
            } else {
                System.out.print(student.toString() + "\n\n");
            }
        }
    }

    /**
     * it removes a student of a classroom and it prints whether it was deleted or not
     * @param studentNumber the number of the student you wish to eliminate
     */
    public void deleteStudent(int studentNumber){
        for (int i = 0; i < capacity; i++){
            if(studentNumber == students[i].getNumber()){
                System.out.println("Student " + this.students[i].getName()+" was removed from the room "+blockName+number+" successfully!");
                students[i].setClass('0',0);
                students[i] = null;
                break;
            }else {
                System.out.println("Couldn't delete student, verify number! ");
            }
        }
    }

    /**
     * it adds an student to the class room and prints whether it was added or not
     * @param student student you wish to insert into a classroom
     */
    public void addStudent(Student student){
        for (int i = 0; i < students.length; i++){
            if(this.students[i] == null){
                this.students[i] = student;
                students[i].setClass(blockName,number);
                System.out.println("Student "+this.students[i].getName()+" was added to the room "+blockName+number+" successfully!");
                break;
            }else {
                System.out.println("Class overflow, couldn't add student");
            }
        }
    }

    @Override
    public String toString(){
        return "Name: "+blockName+"\nCapacity: "+capacity+"\nClass number: "+number;
    }
}
