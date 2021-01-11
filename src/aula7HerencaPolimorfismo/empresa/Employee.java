package aula7HerencaPolimorfismo.empresa;

public class Employee {
	private final String name;

	public Employee(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return 800;
	}

	@Override
	public String toString() {
		return getName()+" makes "+getSalary();
	}
}
