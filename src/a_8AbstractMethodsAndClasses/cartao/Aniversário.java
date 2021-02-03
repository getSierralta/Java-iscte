package a_8AbstractMethodsAndClasses.cartao;

public class Aniversário extends CartaoPresente {
    private String message= "Feliz Aniversário "+getDestinatario()+"!🎂\nEspero que este ano seja um ano de alegrias e que continues a ser cada vez mais tu!";

    public Aniversário(String destinatario){
        super(destinatario);

    }

    @Override
    public void showMessage(){
        System.out.println(message);
    }

    public void showDiaDosNamorados(){
        System.out.println("To:"+getDestinatario());
        showMessage();
    }

}
