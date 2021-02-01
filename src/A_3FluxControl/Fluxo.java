package A_3FluxControl;

public class Fluxo {

    //Implemente a seguinte função getTemperature de forma a:
    //○ Imprima “Está gelado” se a temperatura for inferior a 0;
    //○ Imprima “Está frio” se a temperatura for inferior a 15;
    //○ Imprima “Está quente” se a temperatura for superior a 50;
    //○ Imprima “Está a ferver” se a temperatura for superior a 80;
    //○ Imprima “Está normal” para os casos que sobram.
    public static void getTemperature(int temp){
        if(temp < 0){
            System.out.print("Ésta gelado.");
        }else if (temp < 15){
            System.out.print("Ésta frio.");
        }else if (temp > 50 && temp <= 80){
            System.out.print("Ésta quente.");
        }else if (temp > 80){
            System.out.print("Ésta a ferver.");
        }else{
            System.out.print("Ésta normal.");
        }

    }

    //Criar uma função que nos diga se um número inteiro dado pelo utilizador é positivo, negativo ou
    //zero.
    public static void analizeNumber(int n){
        if(n < 0){
            System.out.print("O número é negativo.");
        }else if(n > 0){
            System.out.print("O número é positivo.");
        }else{
            System.out.print("O número é zero.");
        }
    }

    //Após pedir três números inteiros ao utilizador, o programa imprime o maior valor.
    public static void maiorValor(int a,int b, int c){
        if( a>b && a>c ){
            System.out.print("O maior valor é: "+a+".");
        }else if(b>a && b>c){
            System.out.print("O maior valor é: "+b+".");
        }else if(c>a && c>b){
            System.out.print("O maior valor é: "+c+".");
        }else{
            System.out.print("I hurt myself in my confusion!");
        }
    }

    //Criar uma função que dado o ano de nascimento devolve a idade.
    public static int idade(int data){
        return 2020-data;
    }

    //Criar uma função que divide dois números. Caso a divisão seja por zero, a função deve
    //devolver 0.
    public static void divisao(double a, double b){
        if(a == 0){
            System.out.print(0);
        }else if(b==0){
            System.out.print("undefined! Não se pode dividir por zero! BLACK HOLES ARE WHEN GOD TRIED TO DIVIDE BY ZERO!!!\n");
        }else{
            System.out.print(a/b);
        }
    }

    //Criar uma função que devolve verdadeiro se o número dado for par. (Ex: isEven(6) ->
    //true)
    public static void isEven(int a){
        if(a < 0){
            System.out.print("Números negativos não são ímpares nem pares.\n");
        }else if(a%2 == 0){
            System.out.print("É um numero par. ");
        }else{
            System.out.print("É um numero ímpar. ");
        }
    }

    //Criar uma função que devolve verdadeiro se o número dado é positivo e falso caso
    //contrário. (Ex: isPositive(-45) -> false)
    public static boolean isPositive(int a){
        if(a > 0){
            return true;
        }else{
            return false;
        }
    }

    //Criar uma função que devolve o número de rodas que o veículo possui, dado esse
    //mesmo veículo. Assuma apenas os seguintes veículos: automóvel, moto, bicicleta,
    //triciclo, camião, monociclo. (Ex: getWheels(“Bicicleta”) -> 2)
    public static void getWheels(String car){
        switch (car){
            case("automovel"):
                System.out.println("O automovel, tem 4 rodas.");
                break;
            case("moto"):
                System.out.println("A moto, tem 2 rodas.");
                break;
            case("bicicleta"):
                System.out.println("A bicicleta, tem 2 rodas.");
                break;
            case("triciclo"):
                System.out.println("O triciclo, tem 3 rodas.");
                break;
            case("camiao"):
                System.out.println("O camiao, tem entre 16 e 24 rodas.");
                break;
            case("monociclo"):
                System.out.println("O monociclo, tem 1 roda.");
                break;
            default:
                System.out.println("Não esta definido");
        }
    }

    //Criar uma função que indica a nota qualitativa dada uma nota quantitativa. Assuma as
    //seguintes escalas: Excelente (90%-100%), Muito bom (80%-90%), Bom (70%-80%),
    //Suficiente (50%-70%), Insuficiente (30%-50%) e Muito Insuficiente (0%-30%). Caso a
    //nota dada esteja fora da escala, deve retornar Nota inválida. (Ex: getGrade(67) ->
    //“Suficiente”, getGrade(102) -> “Nota inválida”)
    public static void getGrade(double nota){
        if(nota < 0 || nota > 100){
            System.out.print("Nota invalida.");
        }else if(nota > 90 && nota <= 100){
            System.out.print("Excelente.");
        }else if(nota >= 80){
            System.out.print("Muito Bom.");
        }else if(nota >= 70){
            System.out.print("Bom.");
        }else if(nota >= 50){
            System.out.print("Suficiente.");
        }else if(nota >= 30){
            System.out.print("Insuficiente.");
        }else if(nota >= 0){
            System.out.print("Muito insuficiente.");
        }
    }

    //Criar uma função que receba um número inteiro e devolva uma string com o nome do
    //mês correspondente. Para o número inteiro 1 devolve “Janeiro”, para o número inteiro
    //2 devolve “Fevereiro” e por aí adiante. Neste exercício é necessário utilizar o
    //switch-case.
    public static String getMonth(int numero){
        switch (numero){
            case(1):
                return "Janeiro";
            case(2):
                return "fevereiro";
            case(3):
                return "Março";
            case(4):
                return "Abril";
            case(5):
                return "Maio";
            case(6):
                return "Junho";
            case(7):
                return "Julho";
            case(8):
                return "Agosto";
            case(9):
                return "Setembro";
            case(10):
                return "Outubro";
            case(11):
                return "Novembro";
            case(12):
                return "Dezembro";
            default:
                return "mes invalido";
        }
    }

    //Criar uma função que peça ao utilizador o dia, o mês de nascimento e devolva uma
    //string com o signo correspondente. Neste exercício é necessário utilizar o scanner para
    //pedir o dia e o mês de nascimento ao utilizador e utilizar o if-else para ver todas as
    //possibilidades de signos.
    public static String getSign(int dia, int mes){
        if(dia >= 20 && dia <= 31 && mes == 1 || dia >= 1 && dia <= 18 && mes == 2){
            return "Aquário";
        }else if(dia >= 19 && dia <= 29  && mes == 2 || dia >= 1 && dia <= 20 && mes == 3) {
            return "Peixes";
        }else if(dia >= 21 && dia <= 31 && mes == 3 || dia >= 1 && dia <= 19 && mes == 4){
            return "Áries";
        }else if(dia >= 20 && dia <= 30 && mes == 4 || dia >= 1 && dia <= 20 && mes == 5){
            return "Touro";
        }else if(dia >= 21 && dia <= 31 && mes == 5 || dia >= 1 && dia <= 20 && mes == 6){
            return "Gêmeos";
        }else if(dia >= 21 && dia <= 30 && mes == 6 || dia >= 1 && dia <= 22 && mes == 7){
            return "Câncer";
        }else if(dia >= 23 && dia <= 31 && mes == 7 || dia >= 1 && dia <= 22 && mes == 8){
            return "Leão";
        }else if(dia >= 23 && dia <= 31 && mes == 8 || dia >= 1 && dia <= 22 && mes == 9){
            return "Virgem";
        }else if(dia >= 23 && dia <= 30 && mes == 9 || dia >= 1 && dia <= 22 && mes == 10){
            return "Libra";
        }else if(dia >= 23 && dia <= 31 && mes == 10 || dia >= 1 && dia <= 21 && mes == 11){
            return "Escorpião";
        }else if(dia >= 22 && dia <= 30 && mes == 11 || dia >= 1 && dia <= 21 && mes == 12){
            return "Sagitário";
        }else if(dia >= 22 && dia <= 31 && mes == 12 || dia >= 1 && dia <= 19 && mes == 1){
            return "Capricórnio";
        }else{
            return "não existe";
        }
    }

    //Criar uma função que peça ao utilizador três números e os coloque por ordem
    //crescente. Neste exercício é preciso utilizar o scanner para pedir ao utilizador três
    //números.
    public static void numeroCrescente(int a, int b, int c){
        if(a < b && a < c && b < c){
            System.out.println(a+", "+b+", "+c);
        }else if(b < a && b < c && a < c){
            System.out.println(b+", "+a+", "+c);
        }else if(b < c && b < a && c < a){
            System.out.println(b+", "+c+", "+a);
        }else if(c < b && c < a && b < a){
            System.out.println(c+", "+b+", "+a);
        }else if(c < a && c < b && a < b){
            System.out.println(c+", "+a+", "+b);
        }else if(a < c && a < b && c < b){
            System.out.println(a+", "+c+", "+b);
        }else{
            System.out.println("error");
        }
    }
    public  static void ordemCrescente(int a, int b, int c){
        int pos1,pos2,pos3;
        pos1 = Math.min(Math.min(a,b),c);
        pos3 = Math.max(Math.max(a,b),c);
        pos2 = Math.max(Math.min(a,b), Math.min(b,c));
        System.out.println(pos1+" "+pos2+" "+pos3);
    }
    public static void numeroCrescente2(int a, int b, int c){
        if(a>=b){
            if(a>=c){
                if (b>=c){
                    System.out.println(c+", "+b+", "+a);
                }else{
                    System.out.println(b+", "+c+", "+a);
                }
            }else{
                System.out.println(b+", "+a+", "+c);

            }
        }else{
            if(b>=c){
                if(c>=a){
                    System.out.println(a+", "+c+", "+b);
                }else{
                    System.out.println(c+", "+a+", "+b);
                }

            }else{
                System.out.println(a+", "+b+", "+c);
            }
        }
    }
}
