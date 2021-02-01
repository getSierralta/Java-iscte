package A_10InterfacesComparableAndComparator;


import java.util.Arrays;
import java.util.Comparator;

public class Student {
	private final int number;
	private final String name;
	private final int age;
	private final String gender;

	public Student(int number, String name, int age, String gender) {
		this.number = number;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	/**
	 *
	 * @return number of the student
	 */
	public int getNumber() {
		return number;
	}

	/**
	 *
	 * @return name of the student
	 */
	public String getName() {
		return name;
	}

	/**
	 *
	 * @return age of the student
	 */
	public int getAge() {
		return age;
	}

	/**
	 *
	 * @return gender of the student
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * prints all the students inside an array of students
 	 * @param students array of students
	 */
	public static void printStudents(Student[] students){
		System.out.println("\n");
		for (Student student : students){
			System.out.println(student);
		}
	}

	/**
	 *
	 * @return the information of the student
	 */
	@Override
	public String toString() {
		return getName()+" |\tNumber: "+getNumber()+" |\tAge: "+getAge()+" |\tGender: "+getGender();
	}
	//Test
	public static void main(String[] args) {

		Student[] students = new Student[5];
		students[0] = new Student(95,"Juan",10,"M");
		students[1] = new Student(19,"Jose",10,"M");
		students[2] = new Student(54,"Mauro",10,"M");
		students[3] = new Student(68,"Anna",10,"F");
		students[4] = new Student(13,"Pedro",10,"M");

		printStudents(students);
		Arrays.sort(students, new CompareNumber());
		printStudents(students);
		Arrays.sort(students, new CompareName());
		printStudents(students);

	}
	/**
	 * Compares two students base on their number
	 */
	static class CompareNumber implements Comparator<Student> {
		@Override
		public int compare(Student o1, Student o2) {
			return o1.getNumber()-o2.getNumber();
		}
	}
	/**
	 * Compares two students base on their name
	 */
	static class CompareName implements Comparator<Student> {
		@Override
		public int compare(Student o1, Student o2) {
			return o1.getName().compareTo(o2.getName());
		}
	}

}

