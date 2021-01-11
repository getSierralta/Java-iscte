package aula8ClasseAbstracta.calculator2;



public class ScientificCalculator extends Calculator {
    //The ScientificCalculator is a child of Calculator it performs all o calculator's methods
    //plus a few of them own, and it implements all the abstracts methods of calculator
    private String[] historic;

    public ScientificCalculator(){
        historic = new String[1];
        historic[0] = "\nHistoric of the calculator: ";
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
    @Override
    public void replaceHistoric(String[] copy){
        this.historic = new String[copy.length];
        System.arraycopy(copy, 0, this.historic, 0, this.historic.length);

    }
    /**
     *
     * @param a String with the information of a new operation
     * creates a copy of the historic and adds a new element to it (String a)
     */
    @Override
    public void addToHistoric(String a){
        String[] copy = new String[historic.length+1];
        int i;
        for (i = 0; i < this.historic.length; i++){
            copy[i] = historic[i];
        }
        copy[i] = a;
        replaceHistoric(copy);
    }
    @Override
    /* Prints all the elements inside the historic array */
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
    @Override
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
}
