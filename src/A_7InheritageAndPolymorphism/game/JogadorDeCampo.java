package A_7InheritageAndPolymorphism.game;

public class JogadorDeCampo extends  Jogador{
    //● A classe JogadorDeCampo, uma extensão de Jogador, que deve permitir registar e
    //consultar o número de passes feitos e recebidos.
    private int passesFeitos;
    private int passesRecebidos;

    public JogadorDeCampo(String nome, int numero) {
        super(nome, numero);
    }

    public void passeFeito(){
        passesFeitos++;
    }
    public void passeRecebido(){
        passesRecebidos++;
    }

    public void getPasses(){
        System.out.println("Passes feitos por "+super.getNome()+ ": "+passesFeitos+
                "\nPasses recebidos por "+super.getNome()+ ": "+passesRecebidos);
    }

    @Override
    public String toString() {
        return "Estadisticas do jogador: "+getNome()+" - Numero: "+getNumero()+
                "\nPasses feitos: "+this.passesFeitos+"\nPasses recebidos: "+this.passesRecebidos+"\nGoles marcados: "+super.inspetor();
    }
}
