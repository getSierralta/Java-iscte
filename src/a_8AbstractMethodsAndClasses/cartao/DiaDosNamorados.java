package a_8AbstractMethodsAndClasses.cartao;

public class DiaDosNamorados extends CartaoPresente {
    private String message= getDestinatario()+" meu amor,\nEspero que estes chocolates sejam tão doces como tu.❤";

    public DiaDosNamorados(String destinatario){
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
