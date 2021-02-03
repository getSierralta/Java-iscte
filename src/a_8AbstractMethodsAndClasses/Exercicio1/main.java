package a_8AbstractMethodsAndClasses.Exercicio1;

public class main {

    public static void main(String[] args) {

        Assistente assistente1 = new Assistente("Carlos Silva", "1010");
        Vendedor vendedor1 = new Vendedor("Carla Silva", "1011",300);
        Gerente gerente1 = new Gerente("José Silva", "1020");

        System.out.println(assistente1);
        System.out.println(vendedor1);
        System.out.println(gerente1);


    }
}
