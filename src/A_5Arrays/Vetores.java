package A_5Arrays;

public class Vetores {
    public static void printVetor(int[] v){
        System.out.print(v[0]);
        for(int i = 1; i < v.length; i++){
            System.out.print(", "+v[i]);
        }
        System.out.println(".");
    }
    //Construir um vetor de números naturais até um dado número n. Exemplo: naturals(5)->{1,2,3,4,5}
    public static void vectorNumerosNaturais(int[] v){
        for(int i = 0; i<=v.length-1; i++){
            v[i] = i+1;
        }
    }
    //Construir um vetor de dígitos aleatórios (números de 0 a 9), dado o comprimento. Exemplo:
    //randomDigits(5)->{8,2,9,1,2}
    public static void vectorNumerosAleatorios(int[] v){
        for(int i = 0; i<=v.length-1; i++){
            v[i] = (int) (Math.random()*10);
        }
    }
    // preenchimento automático com os números naturais dentro de um intervalo
    public static void vectorNumerosNaturaisIntervalo(int i, int f, int[] v){
        int inicial = i;
        for(; i <= f; i++){
            v[i-inicial] = i;

        }
    }
    //Copiar (replicar) um vetor de inteiros, tendo o novo vetor o mesmo tamanho do argumento.
    //Exemplo: copy({1,2,3},6)->{1,2,3,0,0,0} copy({1,2,3,4,5,6},3)->{1,2,3}
    public static int[] copiarVector(int[] v, int l){
        int[] v2 = new int[l];
        int i = 0;
        while(i < v.length){
            v2[i] = v[i];
            i++;
        }
        return v2;
    }
    // Verificar se existe um determinado número num vetor. Exemplo: exists(5,{1,3,4,5})->true
    //exists(1,{2,3})->false
    public static boolean verificarNumero(int[] v, int n){
        for(int i = 0; i < v.length; i++){
            if(v[i] == n){
                return true;
            }
        }
        return false;
    }
    //Contar o número de ocorrências de um determinado caractere. Exemplo: count(a,{a,b,c,a})->2
    public static int numeroOcorrencias(int[] v, int n){
        int count = 0;
        for(int i = 0; i < v.length; i++){
            if(v[i]==n){
                count++;
            }
        }
        return count;
    }
    //Construir um sub-vetor de outro vetor, dados os índices do primeiro elemento e último a incluir.
    //Exemplo subarry(2,4,{a,d,r,a,c,r,w})}->{r,a,c}
    public static int[] subVetor(int[] v, int i, int f){
        int[] v2 = new int[f-i];
        int x = 0;
        for (; i < f; i++){
            v2[x]=v[i];
            x++;
        }
        return v2;
    }

    //Obter a primeira metade um vetor v, incluindo um parâmetro booleano para permitir se o elemento
    //do meio é para incluir (caso o comprimento do vetor seja ímpar). Se o comprimento for par, este
    //parâmetro não terá efeito. Exemplo firstHalf({b,a,s,w,q}, true)->{b,a,s}
    public static int[] metadeVetor(int[] v, boolean flag){
        int l;
        if(flag){
            l = v.length/2+1;
        }else{
            l = v.length/2;
        }
        int[] v2 = new int[l];
        for (int i = 0; i < l; i++){
            v2[i] = v[i];
        }
        return v2;
    }

    //Construir um vetor juntando outros dois vetores (parte esquerda e parte direita). Exemplo:
    //merge({1,2},{9,10})
    public static int[] merge(int[] v, int[] v2){
        int vl = v.length; // almacenamos o length do primer vetor para poder comenzar a assignar os valores do segundo vetor
        // quando o primeiro acabar

        int[] v3 = new int[v.length+v2.length];

        for (int i = 0; i < v.length; i++){
            v3[i] = v[i];
        }
        for (int i = 0; i < v2.length; i++){
            v3[vl] = v2[i];
            vl++;
        }
        return v3;
    }

    //Construir um vetor invertido com base noutro. Ou seja, o novo vetor será composto pelos
    //elementos do vetor dado pela ordem inversa. Exemplo: invert({t,q,a)}->{a,q,t}
    public static int[] copiarVectorInvert(int[] v){
        int[] v2 = new int[v.length];
        int i = 0;
        int j = v.length-1;
        while(i < v.length){
            v2[i] = v[j];
            i++;
            j--;
        }
        return v2;
    }

    //Construir um vetor com base noutro, de modo o dobro do tamanha e cada elemento duplicado.
    //Exemplo: duplicateEveryElement({a,s,d})->{a,a,s,s,d,d}
    public static int[] doubleVetor(int[] v){
        int[] v2 = new int[v.length*2];
        int j = 0;
        for (int i = 0; i < v.length; i++){
            v2[j] = v[i];
            j++;
            v2[j] = v[i];
            j++;
        }
        return v2;
    }

    //Construir um vetor com base noutro, sendo a primeira metade uma cópia e a segunda metade os
    //mesmos elementos para ordem inversa. Exemplo: duplicateInverted({3,2,1})->(3,2,1,1,2,3)
    public static int[] copiarVectorInvertDouble(int[] v){
        int l2 = v.length;
        int[] v2 = new int[v.length*2];
        int j = v.length-1;
        for (int i = 0; i < v.length; i++){
            v2[i] = v[i];
        }
        for (int i = 0; i < v.length; i++){
            v2[l2] = v[j];
            l2++;
            j--;
        }
        return v2;
    }

    //Construir um vetor com base noutro, representado um cópia sem o elemento do meio (caso o
    //tamanho seja ímpar) Exemplo: copyWithoutMiddleElement({1,2,3,4,5})->{1,2,4,5}
    public static int[] copiarVetorNaoMetade(int[] v){
        int[] v2 = new int[v.length-1];
        for (int i = 0; i< v.length/2; i++){
            v2[i] = v[i];

        }
        for (int i = v.length/2; i < v.length-1; i++){
            v2[i] = v[i+1];
        }
        return v2;
    }

    //Construir um vetor com n números da sequência Fibonacci. Exemplo: fibonacciSequence(7)->
    //{0,1,1,2,3,5,8}
    static int fibonacci(int n){
        if(n <= 1){
            return n;
        }else{
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }
    public static int[] fibonacciVetor(int n){
        int[] v = new int[n];
        for (int i = 0; i < n; i++){
            v[i] = fibonacci(i);
        }
        return v;
    }
    public static void printVetor(char[] v){
        System.out.print(v[0]);
        for(int i = 1; i < v.length; i++){
            System.out.print(", "+v[i]);
        }
        System.out.println("");
    }
    public static int[] naturals(int n){
        int [] nat = new int[n];
        for(int i = 0; i < n; i++){
            nat[i] = i +1;
        }
        return nat;
    }
    public static int[] randomDigits(int n){
        int[] random = new int[n];
        for(int i = 0; i < n; i++){
            random[i] = (int) (Math.random()*10);
        }
        return random;
    }
    public static int[] preencherNumeros(){
        int[] v = new int[50];
        for(int i = 100; i < 150; i++){
            v[i] = i + 101;
        }
        return v;
    }

    public static int[] copy(int[] original, int b){
        int[] copia = new int[b];
        int min = Math.min(b,original.length);
        for(int i = 0; i < min; i++){
            copia[i] = original[i];
        }
        return copia;
    }
    //ex 5 - verificar se vetor contem numero
    public static boolean exist(int a, int[] vet){
        for (int i = 0; i< vet.length; i++){
            if(vet[i]==a){
                return true;
            }
        }
        return false;
    }
    // ex 6 - contar caracteres num vetor
    public static int contar(char a, char[] vet){
        int contador = 0;
        for (int i = 0; i < vet.length; i++){
            if(vet[i] == a){
                contador++;
            }
        }
        return contador;
    }
    // ex 7 - construir um sub- vetor de outro vetor
    public static char[] subArray(int a, int b, char[] vet){
        char[] ret = new char[b - a + 1];
        for (int i = a; i < b; i++){
            ret[i-a] = vet[i];
        }
        return ret;
    }
    public static char[] firstHalf(char[] vet, boolean incluir){
        int tamanho = 0;
        if (incluir){
            tamanho = (int) Math.ceil(vet.length/2.0);
        }else{
            tamanho = (int) Math.floor(vet.length/2.0);
        }
        char[] metade = new char[tamanho];
        for (int i = 0; i < tamanho; i++){
            metade[i] = vet[i];
        }
        return metade;
    }
}
