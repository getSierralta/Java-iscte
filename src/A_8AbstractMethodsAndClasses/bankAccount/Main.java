package A_8AbstractMethodsAndClasses.bankAccount;

public class Main {
    public static void main (String[] args){

        SaveAccount save = new SaveAccount("123456789",0.15);
        ChekingAccount check = new ChekingAccount("987654321");
        save.withdraw(100);
        check.withdraw(100);
        save.deposit(500);
        check.deposit(1600);
        save.getInformation();
        check.getInformation();
        check.setPassword("654321987","987654321");
        System.out.println(check.getMovements());
        check.getInformation();
    }


}
