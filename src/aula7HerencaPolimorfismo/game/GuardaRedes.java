package aula7HerencaPolimorfismo.game;

public class GuardaRedes extends Jogador{
   

    private int goles;
    private int golesP;

    public GuardaRedes(String nome, int numero) {
        super(nome, numero);
    }


    public void registro(boolean inOrOut) {
        if (inOrOut){
            goles++;
        }else {
            golesP++;
        }
    }

    @Override
    public String inspetor(){
        return "Goles sofridos por "+super.getNome()+ ": "+this.goles+
                "\nGoles parados por "+super.getNome()+ ": "+this.golesP;
    }
    @Override
    public String toString() {
        return "Estadisticas do jogador: "+getNome()+" - Numero: "+getNumero()+
                "\nGoles sofridos: "+this.goles+"\nGoles parados: "+this.golesP;
    }
}
