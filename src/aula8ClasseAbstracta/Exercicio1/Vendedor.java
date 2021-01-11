package aula8ClasseAbstracta.Exercicio1;

public class Vendedor extends Funcionario {

    private double comissao;
    public Vendedor(String nome, String codigo, double comissao){
        super(nome,codigo);this.comissao=comissao;
    }



    @Override
    public double calcularSalario(){
        return getSalarioBase()+comissao;
    }

    @Override
    public String toString(){
        return "Vendedor - "+super.toString();
    }




}
