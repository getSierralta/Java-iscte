package A_7InheritageAndPolymorphism.empresa;

public class Business {
	private final String nome;
	private Employee[] arrayEmployee = new Employee[0];
	private double profit;


	public Business(String nome) {
		this.nome = nome;
	}

	public  String getNome(){
		return this.nome;
	}

	public void setProfit(double profit) {
		this.profit = profit;
	}

	public double getProfit(){
		return this.profit;
	}

	/**
	 *
	 * @return the sum of the salaries of all the employees within the business
	 */
	public double getSalariesTotal(){
		double soma = 0;
		for (Employee employee : arrayEmployee) {
			soma += employee.getSalary();
		}
		return soma;
	}

	/**
	 *
	 * @param employee employee you wish to add to the business
	 */
	public void addEmployee(Employee employee){

		Employee[] newArray = new Employee[arrayEmployee.length + 1];
		System.arraycopy(arrayEmployee, 0, newArray, 0, arrayEmployee.length);
		newArray[arrayEmployee.length] = employee;
		this.arrayEmployee = newArray;
	}

	/**
	 * prints all the employees in the business
	 */
	public void printEmployee(){
		for (Employee employee: arrayEmployee){
			System.out.println(employee);
		}
	}
	@Override
	public String toString() {
		String s = nome +", profit = " + getProfit()+".";
		printEmployee();
		return  s;
	}
}
