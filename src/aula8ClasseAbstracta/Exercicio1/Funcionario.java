package aula8ClasseAbstracta.Exercicio1;

public abstract class Funcionario {

    private String nome;
    private String codigo;
    private double salarioBase=800;

    public Funcionario(String nome, String codigo){
        this.nome=nome;
        this.codigo=codigo;
    };

    public String getNome(){return nome; }
    public String getCodigo(){return codigo;}
    public double getSalarioBase(){return salarioBase;}

    public abstract double calcularSalario();

    @Override
    public String toString(){
        return getNome()+" - "+getCodigo()+" recebe o salário de "+calcularSalario();
    }
}
