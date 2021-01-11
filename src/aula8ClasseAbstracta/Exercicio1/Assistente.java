package aula8ClasseAbstracta.Exercicio1;

public class Assistente extends Funcionario {

    public Assistente(String nome, String codigo){
        super(nome,codigo);
    }

    @Override
    public double calcularSalario(){
        return getSalarioBase();
    }

    @Override
    public String toString(){
        return "Assistente - "+super.toString();
    }




}
