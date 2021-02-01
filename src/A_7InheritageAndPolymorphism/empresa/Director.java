package A_7InheritageAndPolymorphism.empresa;

public class Director extends Employee {

	private final Business workPlace;

	public Director(String nome, Business business) {
		super(nome);
		this.workPlace = business;
	}
	public Business getWorkPlace(){
		return workPlace;
	}

	@Override
	public double getSalary() {
		return (super.getSalary() * 2) + (getWorkPlace().getProfit() * 0.01);
	}

	@Override
	public String toString() {
		return super.getName()+" makes "+getSalary()+" and works in "+getWorkPlace();
	}
}
