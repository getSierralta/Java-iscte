package a_6Objects;

import java.util.ArrayList;

public class CreditCard {

    private final String owner;
    private final String number;
    private final String valid;
    private final double maximumValue;
    private double amountSpent;
    ArrayList<String> historic = new ArrayList<>(1);

    public CreditCard(String owner, String number, String validate, double maximumValue) {
        this.owner = owner;
        this.number = number;
        this.valid = validate;
        this.maximumValue = maximumValue;
    }
    //Getters

    public String getOwner() {
        return owner;
    }

    public String getNumber() {
        return number;
    }

    public String getValid() {
        return valid;
    }

    public double getMaximumValue() {
        return maximumValue;
    }

    /**
     * Prints all the elements inside the historic array of the card
     */
    public void getHistoric() {
        System.out.println("Historic of the card "+ number +":\n");
        for (String history: historic) {
            System.out.println(history);
        }
        System.out.println("************************* End of historic *************************");
    }

    /**
     * adds the new history too the historic array
     * @param history a string containing the information of the movement
     */
    public void addHistoric(String history) {
        System.out.println(history);
        historic.add(history);
    }

    /**
     *
     * @return the balance of the credit card
     */
    public double getBalance(){
        return maximumValue - amountSpent;
    }

    /**
     * it pays the dept of the card and it prints the new balance
     * @param payment the amount to pay
     */
    public void payCard(double payment){
        if (getBalance() - payment > 0 ){
            this.amountSpent -= payment;
            addHistoric("Card paid: "+payment+".");
        }else{
            addHistoric("Card paid: "+(payment-this.amountSpent)+".");
            this.amountSpent = 0;
        }
        System.out.println(getBalance());

    }

    /**
     *
     * @param amount of the purchase
     * @param describe description of the purchase, how much, what it was, from where
     */
    public void purchase(int amount, String describe){
        if (amountSpent + amount <= maximumValue){
            addHistoric(describe);
            this.amountSpent += amount;
        }else {
            addHistoric("Error in the purchase of "+describe+" insufficient balance.");
        }

    }

    /**
     *
     * @return prints the historic of the card
     */
    public String getTicket(){
        return historic.get(historic.size()-1);
    }

    @Override
    public String toString() {
        return "CreditCard {" +
                "owner = '" + this.getOwner() + '\'' +
                ", number = '" + this.getNumber() + '\'' +
                ", valid = '" + this.getValid() + '\'' +
                ", maximumValue = " + this.getMaximumValue() +
                '}';
    }
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard("Jose Martinez","5289 0076 2414 4123","12/21",  2500);
        System.out.println(creditCard);
        creditCard.purchase(300,"300$ Nintendo switch");
        creditCard.payCard(200);
        creditCard.purchase(6,"6$ Nata's Cake ");
        creditCard.purchase(900,"900$ Freeze Worth");
        System.out.println(creditCard.getBalance());
        creditCard.payCard(1500);
        creditCard.getHistoric();
        System.out.println(creditCard.getTicket());
        creditCard.purchase(2600,"2600$ Car fiat 5000");
    }
}
