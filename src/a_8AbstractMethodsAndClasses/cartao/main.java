package a_8AbstractMethodsAndClasses.cartao;
/*Escreva uma classe abstrata chamada CartaoPresente. Essa classe representa todos os tipos de cartões presente e
conterá apenas um atributo: destinatario (tipo String).
Nessa classe, deverá também ser declarado o método public abstract void showMessage().
Crie classes filhas da classe CartaoPresente: DiaDosNamorados, Natal e Aniversário. Cada uma dessas classes deve
conter um método construtor que receba o nome do destinatário do cartão. Cada classe também deverá
implementar o método showMessage(), mostrando uma mensagem ao usuário com seu nome e que seja específica
para a data de comemorativa do cartão.
Crie uma classe Teste com um método main onde são criadas instâncias dos 3 tipos de cartões. Depois, exiba as
mensagens desse cartão chamando o método showMessage().*/
public class main {

    public static void main(String[] args){
        CartaoPresente cartao1= new DiaDosNamorados("Camila");
        CartaoPresente cartao2= new Natal("Carlos");
        CartaoPresente cartao3= new Aniversário("João");

        cartao1.showMessage();
        cartao2.showMessage();
        cartao3.showMessage();
    }
}
