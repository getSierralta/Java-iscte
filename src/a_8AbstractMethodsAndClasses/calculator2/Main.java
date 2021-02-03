package a_8AbstractMethodsAndClasses.calculator2;

public class Main {
    public static void main (String[] args){


        ScientificCalculator a = new ScientificCalculator();
        System.out.println(a.sum(5,5)+"\n");
        System.out.println(a.subtraction(5,5)+"\n");
        System.out.println(a.division(5,5)+"\n");
        System.out.println(a.multiplication(5,5)+"\n");
        System.out.println(a.power(5,5)+"\n");
        System.out.println(a.squareRoot(5.0)+"\n");
        System.out.println(a.remainder(5,3)+"\n");
        System.out.println(a.positiveQuadraticFormula(0.1,-2.5,2.5)+"\n");
        System.out.println(a.negativeQuadraticFormula(0.1,-2.5,2.5)+"\n");
        a.printHistoric();
        a.printHistoric(10);
    }


}
