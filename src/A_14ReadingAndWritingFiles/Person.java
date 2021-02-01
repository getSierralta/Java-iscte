package A_14ReadingAndWritingFiles;

public class Person {

	private String name;
	private int age;
	private String based;

	public Person(String person) {
		String[] split = person.split(":");
		try {
			this.name = split[0];
			try {
				this.age = Integer.parseInt(split[1]);
			}catch (NumberFormatException e){
				System.out.println("Is not possible to read the age");
			}
			this.based = split[2];
		}catch (ArrayIndexOutOfBoundsException e){
			System.out.println(e.getMessage());
		}

	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getBased() {
		return based;
	}

	@Override
	public String toString() {
		return  getName() + " lives in "+getBased()+" and is "+getAge()+" years old!";
	}
}
