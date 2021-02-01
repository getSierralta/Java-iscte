package A_7InheritageAndPolymorphism.game;

public class Jogador {
    //● A classe (base) Jogador deve conter o nome e o número do jogador. Deve também ter um
    //método para registar cada golo marcado e um inspetor para o número de golos marcados.
    private String nome;
    private int numero;
    private int goles;

    public Jogador(final String nome, final int numero) {
        this.nome = nome;
        this.numero = numero;
    }
    public String getNome(){
        return nome;
    }
    public int getNumero(){
        return numero;
    }
    public void registro(){
        goles++;
    }
    public String inspetor(){
        return "Goles marcados por "+this.nome+ ": "+this.goles;
    }


}
