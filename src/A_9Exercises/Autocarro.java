package A_9Exercises;

public class Autocarro extends VeiculoTerrestre {

    public Autocarro(int capacidade) {
        super(capacidade);
    }

    @Override
    public int getConsumo(){
        if((double)(getLotacao()/getCapacidade()) > 0.5){
            return getConsumoBase()*2;
        }else {
            return super.getConsumo();
        }
    }
}
