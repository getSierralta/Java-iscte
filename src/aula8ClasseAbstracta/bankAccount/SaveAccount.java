package aula8ClasseAbstracta.bankAccount;

public class SaveAccount extends BankAccount{

    //The yearly return of the money in the account
    private final double rateOfReturn;

    public SaveAccount(String password, double rateOfReturn) {
        super(password);
        this.rateOfReturn = rateOfReturn;
    }

    public double getRateOfReturn() {
        return rateOfReturn;
    }

    /**
     * takes out money of the account only if the account has enough money in it
     * @param amount amount of money to take out of the account
     */
    @Override
    public void withdraw(double amount) {
        if ( super.getBalance() - amount > 0){
            super.setBalance(false,amount);
        }else {
            System.out.println("Error, insufficient balance.");
        }

    }
    /**
     * adds money to the account
     * @param amount amount of money to be deposited
     */
    @Override
    public void deposit(double amount) {
        super.setBalance(true, amount);
        System.out.println(amount+" deposit int the account "+super.getNumber()+" successfully!");

    }

    /**
     * Prints the information of the account
     */
    @Override
    public void getInformation() {
        String s = "Account: " + super.getNumber()+"."
                +"\nBalance: "+ super.getBalance()+"."
                +"\nRate of Return: "+getRateOfReturn()+".";
        System.out.println(s);
    }
}
