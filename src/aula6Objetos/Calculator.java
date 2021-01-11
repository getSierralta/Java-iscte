package aula6Objetos;



public class Calculator {
    //Saves all the operations made by the calculator
    private String[] historic;

    //Initiates the calculator
    public Calculator(){
        historic = new String[1];
        historic[0] = "\nHistoric of the calculator: ";
    }

    /**
     *
     * @param a first number
     * @param b second number
     * @return the sum of the two numbers
     * adds the operation to the historic
     */
    public double sum(double a,double b){
        double result = a+b;
        addToHistoric("Sum: "+a+" + "+b+" = "+result);
        return result;
    }

    /**
     * adds the operation to the historic
     * @param a first number
     * @param b second number
     * @return the subtraction of the two numbers
     */
    public double subtraction(double a,double b){
        double result = a-b;
        addToHistoric("Subtraction: "+a+" - "+b+" = "+result);
        return result;
    }

    /**
     * adds the operation to the historic
     * @param a first number
     * @param b second number
     * @return the division of two numbers
     */
    public double division(double a,double b){
        double result = a/b;
        addToHistoric("Division: "+a+" / "+b+" = "+result);
        return result;
    }
    /**
     * adds the operation to the historic
     * @param a first number
     * @param b second number
     * @return the multiplication of two numbers
     */
    public double multiplication(double a,double b){
        double result = a*b;
        addToHistoric("Multiplication: "+a+" * "+b+" = "+result);
        return result;
    }
    /**
     * adds the operation to the historic
     * @param a first number
     * @param power to which power we wish to elevate our number
     * @return a to the n power
     */
    public double power(double a, int power){
        double result = a;
        for (int i = 1; i < power; i++){
            result = result*a;
        }
        addToHistoric("Power: "+a+" to the "+power+" power = "+result);
        return result;
    }
    /**
     * adds the operation to the historic
     * @param a  number
     * @return the squared root of the number
     */
    public double squareRoot(double a){
        double result = Math.sqrt(a);
        addToHistoric("The squared root of: "+a+" is "+result);
        return result;
    }
    /**
     * adds the operation to the historic
     * @param a first number
     * @param b second number
     * @return the remainder of the division of two numbers
     */
    public double remainder(double a, double b){
        double result = a%b;
        addToHistoric("Reminder: "+a+" / "+b+" = "+result);
        return result;
    }
    /**
     * adds the operation to the historic
     * @param a first number
     * @param b second number
     * @param c third number
     * @return the result of x using the positive squared root
     */
    public double positiveQuadraticFormula(double a, double b,double c){
        double first = -b;
        double second = b*b-4*a*c;
        double third = 2*a;
        double result = (first + Math.sqrt(second))/third;
        addToHistoric("Positive quadratic formula: ("+first+" + √"+second+") / "+third+" = "+result);
        return result;
    }
    /**
     * adds the operation to the historic
     * @param a first number
     * @param b second number
     * @param c third number
     * @return the results of x using the negative squared root
     */
    public double negativeQuadraticFormula(double a, double b,double c){
        double first = -b;
        double second = b*b-4*a*c;
        double third = 2*a;
        double result = (first - Math.sqrt(second))/third;
        addToHistoric("Negative quadratic formula: ("+first+" - √"+second+") / "+third+" = "+result);
        return result;
    }

    /**
     *
     * @param copy copy of the old array with the new operation added to it
     * replace the old array with a new one holding the new information
     */
    private void replaceHistoric(String[] copy){
        this.historic = new String[copy.length];
        System.arraycopy(copy, 0, this.historic, 0, this.historic.length);

    }

    /**
     *
     * @param a String with the information of a new operation
     * creates a copy of the historic and adds a new element to it (String a)
     */
    public void addToHistoric(String a){
        String[] copy = new String[historic.length+1];
        int i;
        for (i = 0; i < this.historic.length; i++){
            copy[i] = historic[i];
        }
        copy[i] = a;
        replaceHistoric(copy);
    }
    //Prints all the elements inside the historic array
    public void printHistoric(){

        for (String s : historic) {
            System.out.println(s + "\n");
        }
        System.out.println("********************** End Historic **********************");
    }

    /**
     *  prints n lines of the historic
     * @param a number of lines you wish to see
     */
    public void printHistoric(int a){
        if(a < historic.length){
            System.out.println("\nLast "+a+" lines of the calculator's historic: \n");
            int i = historic.length - a ;
            for (; i < historic.length; i++){
                System.out.println(historic[i]+"\n");
            }
            System.out.println("********************** End Historic **********************");
        }else {
            System.out.println("\nError the calculator haven't made "+a+" operations yet!\n");
            System.out.println("Here you have the full historic instead: ");
            printHistoric();
        }

    }
    public static void main(String[] args) {
        Calculator a = new Calculator();
        System.out.println(a.sum(5,5)+"\n");
        System.out.println(a.subtraction(5,5)+"\n");
        System.out.println(a.multiplication(5,5)+"\n");
        System.out.println(a.division(5,5)+"\n");
        System.out.println(a.squareRoot(5)+"\n");
        System.out.println(a.power(5,5)+"\n");
        System.out.println(a.remainder(5,3)+"\n");
        System.out.println(a.positiveQuadraticFormula(0.1,-2.5,2.5)+"\n");
        System.out.println(a.negativeQuadraticFormula(0.1,-2.5,2.5)+"\n");
        a.printHistoric();
        a.printHistoric(10);
    }
    
}
