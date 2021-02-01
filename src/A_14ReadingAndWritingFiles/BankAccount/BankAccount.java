package A_14ReadingAndWritingFiles.BankAccount;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class BankAccount {

	private final Person person; //Owner of the account
	private final String file; //Name of the file that will save the movements of the account
	private double balance; //Balance of the account
	private final String accountNumber;
	ArrayList<String> movements = new ArrayList<>(); // An array that will save all the movements that the account made
	private int amountOfMovements; // A Counter that saves the amounts of movements the account has made

	/**
	 *
	 * @param person owner of the account
	 * @param balance of the account
	 */
	public BankAccount(Person person,  double balance) {
		this.person = person;
		this.balance = balance;
		this.accountNumber = accountNumber(); //We crate a number for the account
		this.file = person.getName()+this.accountNumber+"BankAccount.txt"; //We create an unique name for the account
	}

	/**
	 *
	 * @return A String containing a number account
	 */
	public String accountNumber(){
		//We first create the first part of our number containing the country code and the bank code
		StringBuilder number = new StringBuilder("PT500");
		//Then we add 12 random numbers to our number
		for (int i = 0; i <= 12;i++){
			number.append((int)(Math.random() * 10));
		}
		//We return the final result
		return number.toString();
	}

	/**
	 * a method to make movements in the account
	 * @param description of the movement, what, where, withdraw or deposit
	 * @param amount how much to take or to put
	 * @param flag if true is a buy or withdraw (takes money out), if false is a deposit(puts money in)
	 */
	public void makeMovement(String description, double amount, boolean flag){
		this.amountOfMovements++; //We add one more to the counter of the account
		if (flag){ //If is a withdraw
			if(this.balance - amount > 0){ //We check if the account has enough money
				this.balance -= amount; //if it does we take the money out of our balance
				addMovement(this.amountOfMovements+";"+description+";"+amount);
				//We add a movement to our account, an id (The number of the movement), we separate with (;) so we can easily split our message later on
			}else{
				//If the account doesn't have enough money we make a message explaining why (Formatted in the same way as the previous message )
				String message = amountOfMovements+";"+"Error, not enough balance, unable to make:  "+description+";"+amount;
				//We print the message
				System.out.println(message);
				//We add the movement using our message
				addMovement(message);
			}
		}else{
			//if is a deposit we add the money to the account
			this.balance += amount;
			//And then we add the movement to our array
			addMovement(this.amountOfMovements+";"+description+";"+amount);
		}
	}

	/**
	 * add a movement to our account
	 * Format ID;description;amount
	 * @param newMovement a formatted message
	 */
	private void addMovement(String newMovement)  {
		this.movements.add(newMovement);
	}

	/**
	 * prints all the movements inside of our array
	 */
	public void printMovements(){
		for (String string: this.movements){
			//We separate our message so we can print it more nicely
			String[] split = string.split(";");
			System.out.println(split[0]+" |\tDescription: "+split[1]+" |\tAmount: "+split[2]);
		}
	}

	/**
	 * Save the movements inside the array to a file
	 */
	public void saveFile(){
		//We located our file using the name we assigned earlier to this account
		File file = new File(this.file);

		try {
			//If the file exist we delete it for it to not re-writing the same information over and over
			if (file.exists()) {
				if (file.delete()) {
					System.out.println("File deleted");
				}
			}
			//We create a new file
			if (file.createNewFile()){
				System.out.println("File was created");
			}
		}catch (IOException e){
			e.printStackTrace();
		}
		try{
			//We create a writer
			PrintWriter writer = new PrintWriter(file);
			//We write all the elements inside of our list of movements into our file
			for (String movement: this.movements) {
				writer.println(movement);
			}
			//We close our file to avoid corruption
			writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Prints all the elements inside our file
	 */
	public void readFile(){
		try{
			Scanner scanner = new Scanner(new File(this.file));
			//We loop all the lines inside our file
			while (scanner.hasNext()){
				//We separate our message so we can print it more nicely
				String[] split = scanner.nextLine().split(";");
				System.out.println(split[0]+" |\tDescription: "+split[1]+" |\tAmount: "+split[2]);
			}//We close our file to avoid corruption
			scanner.close();
		}catch (Exception e){
			System.out.println(e.getMessage());
		}
	}

	/**
	 * Getters
	 * @return the different fields of our Account
	 */
	public Person getPerson() {
		return person;
	}

	public String getFile() {
		return file;
	}

	public double getBalance() {
		return balance;
	}

	public int getAmountOfMovements() {
		return amountOfMovements;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	/**
	 *
	 * @return a String with all the detailed information of our account
	 */
	@Override
	public String toString() {
		return "BankAccount"+" |\tOwner: "+getPerson()+" |\tAccount Number: "+getAccountNumber()+" |\tBalance: "+getBalance()+" |\tAmount of movements: "+getAmountOfMovements()+" |\tFile name: "+getFile();
	}
}
