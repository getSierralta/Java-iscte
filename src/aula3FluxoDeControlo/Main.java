package aula3FluxoDeControlo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);


        System.out.println("Como te chamas?");
        String name = keyboard.nextLine();
        System.out.print("Olá "+name+"!");
        System.out.println(" Quantos anos tens?");
        int age = keyboard.nextInt();
        System.out.print("Tens "+age+" anos.");
        System.out.println(" É Cual é a temperatura?");
        int temp = keyboard.nextInt();
        Fluxo.getTemperature(temp);
        System.out.println(" Diz-me um número, se faz favor");
        int n = keyboard.nextInt();
        Fluxo.analizeNumber(n);
        System.out.println(" Agora das me mais 1 número :)");
        int a = keyboard.nextInt();
        System.out.println(" Agora das me mais 1 número :9");
        int b = keyboard.nextInt();
        System.out.println(" Agora das me mais 1 número kudasai x(");
        int c = keyboard.nextInt();
        Fluxo.maiorValor(a,b,c);


        System.out.println("Em que ano nasceste?");
        int ano = keyboard.nextInt();
        System.out.println("\nEntao tens "+ Fluxo.idade(ano) +" anos! ");

        System.out.println("\nDivisao: \nInserir numerador: ");
        int divisaoA = keyboard.nextInt();
        System.out.println("\nInserir denominador: ");
        int divisaoB = keyboard.nextInt();
        Fluxo.divisao(divisaoA,divisaoB);

        System.out.println("\nInserir um numero para saber se é par: ");
        int even = keyboard.nextInt();
        Fluxo.isEven(even);

        System.out.println("\nInserir um numero para saber se é positivo:");
        int positive = keyboard.nextInt();
        System.out.print(Fluxo.isPositive(positive));

        keyboard.nextLine();
        System.out.println("\nInserir veiculo para saber o # de rodas:");
        String car = keyboard.nextLine();
        Fluxo.getWheels(car);

        System.out.println("\nQuanto tiraste no ultimo teste?");
        double nota = keyboard.nextDouble();
        Fluxo.getGrade(nota);

        System.out.println("\nEm que mês fazes anos? Pon o número:");
        int mes = keyboard.nextInt();
        System.out.println("O mes "+mes+" é "+ Fluxo.getMonth(mes)+".");

        System.out.println("\nPara Saber o seu signo do zodíaco insira:");
        System.out.println("\nNúmero do dia de anos:");
        int diaS = keyboard.nextInt();
        System.out.println("\nNúmero do mês de anos:");
        int mesS = keyboard.nextInt();
        System.out.println("Se seu aniversario é no "+diaS+"-"+mesS+". Entao seu signo é "+ Fluxo.getSign(diaS,mesS)+".");


        System.out.println("\nDiz-me 3 números:");
        System.out.println("\nPrimer número:");
        int n1 = keyboard.nextInt();
        System.out.println("\nSegundo número:");
        int n2 = keyboard.nextInt();
        System.out.println("\nTercer número:");
        int n3 = keyboard.nextInt();
        System.out.println("Os números ordenados em creceste sao: ");
        Fluxo.ordemCrescente(n1,n2,n3);
    }
}
