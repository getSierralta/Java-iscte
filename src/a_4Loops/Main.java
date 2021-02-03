package a_4Loops;

public class Main {

    public static void main(String[] args) {
        //Ciclos
        //Escreva os numeros pares de 1 a 20, usando as três estructuras de ciclos apresentadas
        int i = 1;
        while(i < 21){
            if(i % 2 == 0){
                System.out.print(i+" ");
            }
            i++;
        }
        System.out.println("\n");

        for (int j = 1; j < 21; j++){
            if(j % 2 == 0){
                System.out.print(j+" ");
            }
        }
        System.out.println("\n");
        int k = 1;
        do{
            if(k % 2 == 0){
                System.out.print(k+" ");
            }
            k++;
        }while (k < 21);
        System.out.println("\n");


        int[] v = new int[3];
        v[0] = 2;
        v[2] = 4;
        v[1] = 9;

        int size = v.length;
        int first = v[0];
        int last = v[v.length-1];

        System.out.println("O tamanho do vector é: "+size);
        System.out.println("O primeiro elemento do vector é: "+first);
        System.out.println("O último elemento do vector é: "+last);

        System.out.println("A suma dos valores do vector é: "+ Loops.sum(v));

        System.out.println("O numero de vezes que o numero 2 aparece no vector é: "+ Loops.numberOfOccurrences(2,v));

        System.out.println("Existe o número '2' no vector? "+ Loops.existencia(2,v));
        System.out.println("Existe o número '4' no vector? "+ Loops.existencia(4,v));
        System.out.println("Existe o número '0' no vector? "+ Loops.existencia(0,v));
        System.out.println("Existe o número '6' no vector? "+ Loops.existencia(6,v));
        System.out.println("Existe o número '-7' no vector? "+ Loops.existencia(-7,v));
        System.out.println("O valor maximo do vector é:  "+ Loops.valorMaximo(v));
        System.out.println("O valor minimo do vector é:  "+ Loops.valorMinimo(v));

        Loops.sumWhile(1,100);
        Loops.sumFor(1,100);
        Loops.divisores(9);
        System.out.println("A sumatoria de todos os divisores de 9 (exlui o própio número), é igual a: "+ Loops.sumaDivisores(9));
        Loops.numeroPrimoIntervalo(1,100);

        // usando os três ciclos, suma os numeros naturais do 0 ao 10
        System.out.println("Sumatoria com while: "+ Loops.sumaDoWhile(1,10));
        System.out.println("Sumatoria com do-while: "+ Loops.sumaDoWhile(1,10));
        System.out.println("Sumatoria com for: "+ Loops.sumaFor(1,10));
        Loops.soma20Pares();
        System.out.println("\n"+ Loops.fibonacci(7));
        Loops.desenharQuadrado();
        System.out.println(Loops.intervalMasPrimes(5585482,764283482));

    }
}
