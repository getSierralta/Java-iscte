package a_14ReadingAndWritingFiles.bankAccount;

public class Person {
	/**
	 * Simple person class containing a name, a getName and a toString
	 */
	private String name;

	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return getName();
	}
}
