package aula8ClasseAbstracta.cartao;

public abstract class CartaoPresente {

    private String destinatario;

    public CartaoPresente(String destinatario){
        this.destinatario=destinatario;
    }

    public String getDestinatario(){
        return destinatario;
    }

    public abstract void showMessage();

}
