package a_8AbstractMethodsAndClasses.cartao;

public class Natal extends CartaoPresente {
    private String message= "Feliz Natal "+getDestinatario()+"!🎄\nFelicidades para si e para toda a sua família!";

    public Natal(String destinatario){
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
