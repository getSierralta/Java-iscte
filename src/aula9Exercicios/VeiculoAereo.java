package aula9Exercicios;

public abstract class VeiculoAereo extends Veículo{

    public VeiculoAereo(int capacidade) {
        super(capacidade);
    }

    @Override
    public int getConsumo() {
        return getConsumoBase()*3;
    }

}
