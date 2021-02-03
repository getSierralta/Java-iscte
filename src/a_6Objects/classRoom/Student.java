package a_6Objects.classRoom;

public class Student {
    //Each student has a number, a name, and the information of the class they are in
    private final int number;
    private final String name;
    private int classNumber;
    private char blockName;


    public Student(int number, String name){
        this.number = number;
        this.name = name;

    }

    /**
     *
     * @return number of the student
     */
    public String getName(){
        return this.name;
    }

    /**
     *
     * @return number of the student
     */
    public int getNumber(){
        return this.number;
    }

    /**
     * it changes the classroom information inside the student
     * @param blockName of the new classroom
     * @param classNumber of the new classroom
     */
    public void setClass(char blockName,int classNumber){
        this.blockName = blockName;
        this.classNumber = classNumber;
    }

    @Override
    public String toString(){
        return "Name: "+name+"\nClass name: "+blockName+classNumber+"\nNumber: "+number;
    }
}
