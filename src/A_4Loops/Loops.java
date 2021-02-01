package A_4Loops;

public class Loops {
    //A suma de todos os valores dentro de um vetor
    public static int sum(int[]v){
        int i = 0;
        int sum = 0;
        while(i != v.length){
            sum = sum +v[i];
            i++;
        }
        return sum;
    }

    //Quantas vezes um numero aparece num vetor
    public static int numberOfOccurrences(int a, int[] v){
        int i =0;
        int count = 0;
        while(i != v.length){
            if(v[i] == a){
                count++;
            }
            i++;
        }
        return count;
    }

    //Testa se um numero existe dentro de um vetor
    public static boolean existencia( int a, int[] v){
        int i = 0;
        boolean result = false;
        while(i < v.length){
            if(v[i] == a){
                result = true;
                break;
            }
            i++;
        }
        return result;
    }

    // código que devolveria o valor máximo de um vector
    public static int valorMaximo(int[] v){
        int maximo = 0;
        for(int i = 0; i < v.length; i++){
            if(v[i]>maximo){
                maximo = v[i];
            }
        }
        return maximo;
    }

    // código que devolveria o valor minimo de um vector
    public static int valorMinimo(int[] v){
        int minimo = valorMaximo(v);
        for(int i = 0; i < v.length; i++){
            if(v[i]< minimo ){
                minimo = v[i];
            }
        }
        return minimo;
    }

    // Criar uma função que mostre a soma de todos os números no intervalo de 1 até 100
    // utilizando o While.
    /**
     *
     * @param i valor inicial do intervalo a sumar
     * @param f valor final do intervalo a sumar
     * @return a soma de todos os numeros no intervalo pre-establecido
     */
    public static void sumWhile(int i, int f){
        int sum = 0;
        f = f + 1;
        while(i < f){
            System.out.print(sum+" + "+i);
            sum = sum + i;
            System.out.print(" = "+sum+".\n");
            i++;
        }
    }

    // Criar uma função que mostre a soma de todos os números no intervalo de 1 até 100
    // utilizando o For
    /**
     *
     * @param i valor inicial do intervalo a sumar
     * @param f valor final do intervalo a sumar
     * @return a soma de todos os numeros no intervalo pre-establecido
     */
    public static void sumFor(int i, int f){
        int sum = 0;
        f = f + 1;
        for (; i < f; i++){
            System.out.print(sum+" + "+i);
            sum = sum + i;
            System.out.print(" = "+sum+".\n");
        }
    }

    //Criar uma função que devolva o número de divisores de um número inteiro n. Esta
    //função deverá iterar sobre os números naturais até n, contando os números que são
    //divisores de n.

    /**
     *
     * @param n numero intero
     */
    public static void divisores(int n){
        int j = n+1;
        int count = 0;
        String numeros = "Os divisores de "+n+" são: ";
        for (int i = 1; i < j; i++){
            if(n%i == 0){
                numeros = numeros +i+". ";
                count++;
            }
        }
        System.out.println(numeros);
        System.out.println(n+" pode ser dividido entre "+count+" numeros diferentes. ");
    }
    //Criar uma função que devolva o somatório dos divisores próprios de um número
    //inteiro n (o conjunto dos divisores exclui o próprio número). Esta função deverá iterar
    //sobre os números naturais até n (exclusive), acumulando os números que são divisores
    //de n.
    /**
     *
     * @param n numero enteiro
     */
    public static int sumaDivisores(int n){
        int i;
        int j = n+1;
        int divisores = 0;
        for (i = 1; i < j; i++){
            if(n%i == 0 && i != n){
                divisores = divisores + i;
            }
        }
        return divisores;
    }
    //Criar uma função que que recebe como argumento um número natural e devolve
    //verdadeiro caso seja primo, ou falso caso contrário.
    public static boolean numeroPrimo(int n){
        if(n%2 == 0){
            return true;
        }
        return false;
    }
    //Criar uma função que permite saber se existe algum número primo num dado
    //intervalo (aberto).

    public static void numeroPrimoIntervalo(int i, int f) {
        System.out.println("Os números primos no intervalo do "+i+" a "+f+" são: ");
        while (i < f) {
            if(verificarNumeroPrimo(i)){
                System.out.print(i + " ");
            }
            ++i;
        }
    }

    public static boolean verificarNumeroPrimo(int num) {
        boolean flag = true;

        for(int i = 2; i <= num/2; ++i) {
            if(num % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }
    public static int sumaWhile(int i, int f){
        int suma = 0;
        while(i <= f){
            suma = suma + i;
            i++;
        }
        return suma;
    }
    public static int sumaDoWhile(int i, int f){
        int suma = 0;
        do{
            suma = suma + i;
            i++;
        }while(i <= f);
        return suma;
    }
    public static int sumaFor(int i, int f){
        int suma = 0;
        for(; f >= i; f--){
            suma = suma + f;
        }
        return suma;
    }
    public static boolean isEven(int n){
        return n % 2 == 0;
    }

    //Imprimir de 1 a 20 os numeros pares

    public static void soma20Pares(){
        int i = 1;
        while(i<= 20){
            if(isEven(i)){
                System.out.print(i+". ");
            }
            i++;
        }
    }
    static int fibonacci(int n){
        if(n <= 1){
            return n;
        }else{
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }
    //Verificar qual é o valor maximo do nosso vetor
    public static int oMaior(int[]vetor){
        int max = vetor[0];
        int count = 1;
        while (count < vetor.length){
            if(vetor[count]> max){
                max = vetor[count];
            }
            count++;
        }
        return max;
    }
    //Verificar qual é o valor minimo do nosso vetor
    public static int oMinimo(int[]vetor){
        int max = vetor[0];
        int count = 1;
        while (count < vetor.length){
            if(vetor[count]> max){
                max = vetor[count];
            }
            count++;
        }
        return max;
    }
    public static void desenharQuadrado(){
        int[][] matriz = new int[5][5];
        for(int i = 0; i<matriz.length; i++){

            for (int j = 0; j<matriz[i].length; j++){
                matriz[i][j] = 0;
                System.out.print(matriz[i][j]);
            }
            System.out.println(" ");
        }
    }
    public static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        for (int i = 2; i < n; i++){
            if(n%i == 0){ //n divisivel por i
                return false; // nao é primo
            }
        }
        return true;
    }
    public static boolean intervalMasPrimes(int a, int b){
        for (int i = a; i <= b; i++){
            if(isPrime(i)){
                System.out.println("Numero primo encontrado: "+i);
                return true;
            }
        }
        return false;
    }
}
