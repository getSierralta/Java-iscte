package a_5Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("Numeros naturais até 39: ");
        int[] nat = Vetores.naturals(39);
        Vetores.printVetor(nat);
        char[] vetChar = {'a','b','c','a'};
        System.out.println("Vetor: ");
        Vetores.printVetor(vetChar);
        System.out.println("Contagem de 'a' no vetor == "+ Vetores.contar('a',vetChar));
        char[] vetChar2 = {'a','b','c','a', 'f','1'};
        System.out.println("Vetor de caracteres: ");
        Vetores.printVetor(vetChar2);
        char[] subVet = Vetores.subArray(2,4,vetChar2);
        System.out.println("Entre 2 e 4: ");
        Vetores.printVetor(subVet);

        int[] v = new int[5];
        Vetores.vectorNumerosNaturais(v);
        int[] v1 = new int[50];
        Vetores.vectorNumerosNaturaisIntervalo(101,150,v1);
        int[] v2 = Vetores.copiarVector(v,9);
        System.out.println(Vetores.verificarNumero(v,9));
        System.out.println(Vetores.numeroOcorrencias(v,5));
        int[] v3 = Vetores.subVetor(v,2,5);
        int[] v4 = Vetores.metadeVetor(v,true);
        int[] v5 = Vetores.merge(v2,v3);
        int[] v6 = Vetores.copiarVectorInvert(v);
        int[] v7 = Vetores.doubleVetor(v);
        int[] v8 = Vetores.copiarVectorInvertDouble(v);
        int[] v9 = Vetores.copiarVetorNaoMetade(v);
        int[] v10 = Vetores.fibonacciVetor(10);
        Vetores.printVetor(v);
        Vetores.printVetor(v1);
        Vetores.printVetor(v2);
        Vetores.printVetor(v3);
        Vetores.printVetor(v4);
        Vetores.printVetor(v5);
        Vetores.printVetor(v6);
        Vetores.printVetor(v7);
        Vetores.printVetor(v8);
        Vetores.printVetor(v9);
        Vetores.printVetor(v10);

    }
}
