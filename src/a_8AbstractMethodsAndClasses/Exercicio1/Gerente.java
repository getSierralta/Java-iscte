package a_8AbstractMethodsAndClasses.Exercicio1;

public class Gerente extends Funcionario {

    public Gerente(String nome, String codigo){
        super(nome,codigo);
    }



    @Override
    public double calcularSalario(){
        return getSalarioBase()*2;
    }

    @Override
    public String toString(){
        return "Gerente - "+super.toString();
    }




}
