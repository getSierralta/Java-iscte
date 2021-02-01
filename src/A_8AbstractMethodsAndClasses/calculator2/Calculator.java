package A_8AbstractMethodsAndClasses.calculator2;



public abstract class Calculator {
    //Saves all the operations made by the calculator

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
     *
     * @param copy copy of the old array with the new operation added to it
     * replace the old array with a new one holding the new information
     */
    public abstract void replaceHistoric(String[] copy);

    /**
     *
     * @param a String with the information of a new operation
     * creates a copy of the historic and adds a new element to it (String a)
     */
    public abstract void addToHistoric(String a);

    //Prints all the elements inside the historic array
    public abstract void printHistoric();

    /**
     *  prints n lines of the historic
     * @param a number of lines you wish to see
     */
    public abstract void printHistoric(int a);
    
}
