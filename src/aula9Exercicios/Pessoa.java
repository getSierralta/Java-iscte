package aula9Exercicios;

public class Pessoa {
    private String nome;
    private boolean temCartaDeConducao;
    private boolean trabalhaForcaAerea;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isTemCartaDeConducao() {
        return temCartaDeConducao;
    }

    public void setTemCartaDeConducao(boolean temCartaDeConducao) {
        this.temCartaDeConducao = temCartaDeConducao;
    }

    public boolean isTrabalhaForcaAerea() {
        return trabalhaForcaAerea;
    }

    public void setTrabalhaForcaAerea(boolean trabalhaForcaAerea) {
        this.trabalhaForcaAerea = trabalhaForcaAerea;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", temCartaDeConducao=" + temCartaDeConducao +
                ", trabalhaForcaAerea=" + trabalhaForcaAerea +
                '}';
    }





}
