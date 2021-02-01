package A_8AbstractMethodsAndClasses.bankAccount;

public abstract class BankAccount {

    private String password;
    private String number;
    private double balance = 0;

    public BankAccount(String password) {
        this.password = password;
        createNumber();
    }

    /**
     *
     * Generates the number of the card
     */
    private void createNumber() {
        StringBuilder number = new StringBuilder("PT50 0002");
        for (int i = 0; i < 17; i++){
            number.append((int) (Math.random() * 10));
        }
        this.number = number.toString();
    }

    public String getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    /**
     *
     * @param inOrOut a boolean, true if they are going to add money false if they are going to take out money
     * @param amount how much they will add or take
     */
    public void setBalance(boolean inOrOut, double amount) {

        if (inOrOut){
            balance += amount;
        }else {
            balance -= amount;
        }
    }

    /**
     * it changes the password, only if the old password match this.password
     * @param newPassword the new password
     * @param oldPassword the old password
     */
    public void setPassword(String newPassword, String oldPassword) {
        if (oldPassword.equals(password)){
            this.password = newPassword;
            System.out.println("Password change successfully!");
        }else {
            System.out.println("Incorrect password");
        }

    }

    /**
     *
     * Methods to be develop in the child classes
     */

    public abstract void withdraw(double amount);

    public abstract void deposit(double amount);

    public abstract void getInformation();
}
