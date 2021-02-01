package A_6Objects;

public class Person {

    //Fields
    private final String firstName;
    private String lastName;
    private final int age;
    private String nationality;
    //Constructor
    public Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    //Methods
    public  String getFirstName(){
        return firstName;
    }


    public  String getLastName(){
        return lastName;
    }

    public  void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getNationality(){
        return nationality;
    }

    public void setNationality(String nationality){
        this.nationality = nationality;
    }


    @Override
    public String toString(){
        return "First name: "+firstName+"\nLast name: "+lastName+"\nAge: "+age;
    }

    public static void main(String[] args){
        Person first = new Person("Maria","Silva",28);

        first.setNationality("Potuguese");
        System.out.println(first.getNationality());
        System.out.println(first.toString());
    }
}
