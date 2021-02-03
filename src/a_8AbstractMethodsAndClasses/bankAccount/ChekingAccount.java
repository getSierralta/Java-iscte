package a_8AbstractMethodsAndClasses.bankAccount;

public class ChekingAccount extends BankAccount {

    private int movements;

    public ChekingAccount(String password) {
        super(password);
    }

    /**
     *
     * @return the amount of movements this account has made
     */
    public int getMovements() {
        return movements;
    }

    /**
     * takes out money of the account only if the account has enough money in it
     * @param amount amount of money to take out of the account
     */
    @Override
    public void withdraw(double amount) {
        movements++;
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
        movements++;
        super.setBalance(true, amount);
        System.out.println(amount+" deposit int the account "+super.getNumber()+" succesfully!");

    }

    /**
     * Prints the information of the account
     */
    @Override
    public void getInformation() {
        String s = "Account " + super.getNumber()+"."
                +"\nBalance "+ super.getBalance()+"."
                +"\nMovements "+this.movements+".";
        System.out.println(s);
    }
}
