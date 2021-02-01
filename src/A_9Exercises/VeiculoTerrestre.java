package A_9Exercises;

public abstract class VeiculoTerrestre extends Veículo {

    public VeiculoTerrestre(int capacidade) {
        super(capacidade);
    }

    @Override
    public int getConsumo() {
        return getConsumoBase();
    }
}
