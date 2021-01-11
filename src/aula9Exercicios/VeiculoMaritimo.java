package aula9Exercicios;

public abstract class VeiculoMaritimo extends Veículo {

    public VeiculoMaritimo(int capacidade) {
        super(capacidade);
    }

    @Override
    public int getConsumo() {
        return getConsumoBase()*2;
    }
}
