package aula7HerencaPolimorfismo.empresa;

public class Manager extends Employee {

	private  boolean objectives = false;

	public Manager(String name) {
		super(name);
	}

	/**
	 *
	 * @param madeIt if it made the objectives or not
	 */
	public void setObjectives(boolean madeIt){
		this.objectives = madeIt;
	}

	/**
	 *
	 * @return if the manager made the objectives they get 200$ more than the base
	 */
	@Override
	public double getSalary() {
		if (objectives){
			return super.getSalary() + 200;
		}
		return super.getSalary();
	}

	@Override
	public String toString() {
		return super.getName()+" makes "+ getSalary();
	}
}
