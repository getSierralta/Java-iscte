package aula2VariaveisTipoDeDados;

public class Variaveis {
    //Criar uma função que tenha 3 argumentos e retorne a soma dos primeiros dois,
    //multiplicando pelo terceiro argumento
    static int sumMult(int a, int b, int c){
        return (a+b)*c;
    }


    //criar uma função que retorne a área de um círculo com raio r
    static int cicleArea(int r){
        System.out.println("Se o raio do circulo é: " + r);
        double area = Math.PI * (r*r);
        return (int) area;
    }


    //Criar uma função que permita convertir uma temperatura
    //em graus Celsius para Fahrenheit
    static double CelToFah(double c){
        return c * 9/5 +32;
    }
    static int FahToCel(int f){
        return (f - 32)  * 5/9;
    }


    //Criar uma função que permita arredondear um decimal
    static int arredondar(double d){
        return (int)(d +0.5);
        // 3.2 + 0.5 = 3
        // 3.8 + 0.5 = 4
    }
    static int arredondar2(double d){
        if (d<0){
            return (int) (d - 0.5);
            // -7.2 - 0.5 = -7
            //-7.7 - 0.5 = -8
        }else{
            return (int) (d + 0.5);
        }
    }
    //Obter a soma de dois números.
    static double somaDecimais(double a,double b){
        return a+b;
    }

    //Obter o quadrado de um número.
    static double quadradoDecimais(double a){
        return a*a;
    }

    //Obter a diferença entre dois números.
    static double diferencaDecimais(double a, double b){
        return a%b;
    }

    //Obter a média entre dois números.
    static double mediaAritmeticaDecimais( double a, double b){
        return (a+b)/2;
    }
    static double mediaGeometricaDecimais( double a, double b){
        return Math.sqrt(a*b);
    }
    static double mediaHarmônicaDecimais( double a, double b){
        return 2/(1/a+1/b);
    }
    static double mediaQuadraticaDecimais( double a, double b){
        return Math.sqrt(((quadradoDecimais(a)+ quadradoDecimais(b))/2));
    }

    //Obter a área de um retângulo, dando os lados.
    static double areaRetanguloDecimais(double a, double b){
        return a*b;
    }

    //Dada uma temperatura em Celcius, obter a temperatura em Fahrenheit.
    static double celciusAFarenheitDecimais(double a){
        return a * 9/5 + 32;
    }

    //Dada uma temperatura em Celsius, obter a temperatura em kelvin.
    static double celciusAKelvinDecimais(double a){
        return a + 273.15;
    }

    //Dado um comprimento em centímetros, obter o valor em polegadas.
    static double centimetrosAPolegadasDecimais(double a){
        return a / 2.54;
    }

    //Dado um preço, obter o IVA a 23% correspondente ao mesmo. (Ex: 100€ -> 18.70€).
    static double ivaNormalDecimais(double a){
        return a * 0.23;
    }
    static double ivaIntermediaDecimais(double a){
        return a * 0.13;
    }
    static double ivaReduzidaDecimais(double a){
        return a * 0.06;
    }

    //Obter o perímetro de um círculo, dado o seu diâmetro.
    static double perimetroCirculoDecimais(double a){
        return 2*Math.PI*a;
    }

    //Obter a área de um prisma retangular, dando a sua largura, altura e comprimento.
    static double areaPrismaRetangularDecimais(double a, double b, double c){
        return 2*(a*b+b*c+a*c);
    }
}
