package aula14Ficheiros.BankAccount;


public class Main {
	public static void main(String[] args) {

		//We test our BankAccount
		//We create a person that will be the owner of the bank account
		Person person = new Person("Juan");
		//We create the account
		BankAccount bankAccount = new BankAccount(person,  1600);
		//We make some movements
		bankAccount.makeMovement("Lunch",5,true);
		bankAccount.makeMovement("Breakfast",3,true);
		bankAccount.makeMovement("Deposit",100,false);
		//We print all our movements
		bankAccount.printMovements();
		//We separate our movements from our file for better reading
		System.out.println("-------------------------------------------");
		//We save our file and then we read it
		bankAccount.saveFile();
		bankAccount.readFile();
		//We print the information of out account
		System.out.println(bankAccount);
	}
}
