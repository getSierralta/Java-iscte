package aula2VariaveisTipoDeDados;

public class Main {

    public static void main(String[] args) {
        int a = (int) (Math.random() * 100);
        int b = (int) (Math.random() * 100);
        int c = (int) (Math.random() * 100);
        double soma = Variaveis.somaDecimais(a,b);
        double quadrado = Variaveis.quadradoDecimais(a);
        double diferencia = Variaveis.diferencaDecimais(a,b);
        double mediaAritmetica = Variaveis.mediaAritmeticaDecimais(a,b);
        double mediaGeometrica = Variaveis.mediaGeometricaDecimais(a,b);
        double mediaHarmonica = Variaveis.mediaHarmônicaDecimais(a,b);
        double mediaQuadratica = Variaveis.mediaQuadraticaDecimais(a,b);
        double celciusFarenheit = Variaveis.celciusAFarenheitDecimais(a);
        double celciusKelvin = Variaveis.celciusAKelvinDecimais(a);
        double centimetrosPolegadas = Variaveis.centimetrosAPolegadasDecimais(a);
        double ivaNormal = Variaveis.ivaNormalDecimais(a);
        double ivaIntermedia = Variaveis.ivaIntermediaDecimais(a);
        double ivaReduzida = Variaveis.ivaReduzidaDecimais(a);
        double perimetroCirculo = Variaveis.perimetroCirculoDecimais(a);
        double areaRetangulo = Variaveis.areaRetanguloDecimais(a,b);
        double areaPrismaretangulo = Variaveis.areaPrismaRetangularDecimais(a,b,c);

        System.out.println("\nNumeros a testar. A: "+a+", B: "+b+" e C:"+c+". C só utilizado no calculo da área do Prisma Retangulo.\n");
        System.out.println("A Soma dos numeros a testar é: "+ soma + ", aproximadamente: "+ Variaveis.arredondar(soma)+".\n");
        System.out.println("O Quadrado do numero a testar é: " + quadrado + ", aproximadamente: "+ Variaveis.arredondar(quadrado)+".\n");
        System.out.println("A Diferencia dos numeros a testar é: " +diferencia+ ", aproximadamente: "+ Variaveis.arredondar(diferencia)+".\n");
        System.out.println("A Média Aritmetica dos numeros a testar é: "+ mediaAritmetica + ", aproximadamente: "+ Variaveis.arredondar(mediaAritmetica)+".\n");
        System.out.println("A Média Géometrica dos numeros a testar é: "+ mediaGeometrica + ", aproximadamente: "+ Variaveis.arredondar(mediaGeometrica)+".\n");
        System.out.println("A Média Harmônica dos numeros a testar é: "+ mediaHarmonica + ", aproximadamente: "+ Variaveis.arredondar(mediaHarmonica)+".\n");
        System.out.println("A Média Quadrática dos numeros a testar é: "+ mediaQuadratica + ", aproximadamente: "+ Variaveis.arredondar(mediaQuadratica)+".\n");
        System.out.println("A converção do numero a testar  de Celcius Cº a Farenheit Fº é: "+celciusFarenheit + ", aproximadamente: "+ Variaveis.arredondar(celciusFarenheit)+".\n");
        System.out.println("A converção do numero a testar de Celcius Cº a Kelvin Kº é: " + celciusKelvin+", aproximadamente: "+ Variaveis.arredondar(celciusKelvin)+".\n");
        System.out.println("A converção do numero a testar de Centimetros a Polegadas é: " +centimetrosPolegadas+ ", aproximadamente: "+ Variaveis.arredondar(centimetrosPolegadas)+".\n");
        System.out.println("O preço com iva normal de "+ a +" é "+a+ivaNormal+", aproximadamente: "+ Variaveis.arredondar((a+ivaNormal))+".\n");
        System.out.println("O preço com iva intermedio de "+ a +" é "+a+ivaIntermedia+", aproximadamente: "+ Variaveis.arredondar((a+ivaIntermedia))+".\n");
        System.out.println("O preço com iva reduzido de "+ a +" é "+a+ivaReduzida+", aproximadamente: "+ Variaveis.arredondar((a+ivaReduzida))+".\n");
        System.out.println("O perimetro de um circulo com o raio "+a+" é: "+perimetroCirculo+", aproximadamente: " + Variaveis.arredondar(perimetroCirculo)+".\n");
        System.out.println("A Área do Retangulo dos numeros a testar é: "+areaRetangulo + ", aproximadamente: "+ Variaveis.arredondar(areaRetangulo)+".\n");
        System.out.println("A Área do Prisma Retangulo dos numeros a testar é: "+areaPrismaretangulo + ", aproximadamente: "+ Variaveis.arredondar(areaPrismaretangulo)+".\n");

    }
}
