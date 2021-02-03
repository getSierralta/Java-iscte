package a_8AbstractMethodsAndClasses;

public class Main {
    public static void main (String[] args){
        System.out.println((int)'b');
        System.out.println(encode("ola carlos"));
    }

    private final char[] abc= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

    //objetio - criar uma função que, dado uma string
    //retorna a mesma convertida no se valor numérico
    //ex - ABC DEF - 1-2-3-4-5-6
    public static String encode(String frase){
        char[] caracteres = frase.toCharArray();
        //ABC -> 'A', 'B', 'C'
        String retorno = "";
        for(char c: caracteres){
            if(c== ' '){
                retorno += ' ';}else{
                retorno += (((int)c)-96)+"-";
            }

        }return retorno;

    }
}
