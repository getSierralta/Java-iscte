package A_7InheritageAndPolymorphism.game;

public class Main {

    public static void main(String[] args) {


        JogadorDeCampo uno = new JogadorDeCampo("Pedro",1);
        JogadorDeCampo dos = new JogadorDeCampo("Juancito",2);
        GuardaRedes cuatro = new GuardaRedes("Carlos", 4);
        uno.passeFeito();
        dos.passeRecebido();
        dos.passeFeito();
        cuatro.registro(true);
        uno.passeRecebido();
        dos.passeFeito();
        uno.passeRecebido();
        cuatro.registro(false);
        uno.passeRecebido();
        uno.registro();
        uno.passeRecebido();
        cuatro.registro(true);
        uno.passeRecebido();
        dos.registro();
        dos.registro();
        cuatro.registro(false);
        cuatro.registro(true);
        uno.getPasses();
        dos.getPasses();
        System.out.println(cuatro.inspetor());
        System.out.println(uno.inspetor());
        System.out.println(dos.inspetor());
        System.out.println(uno);
        System.out.println(dos);
        System.out.println(cuatro);
    }
}
