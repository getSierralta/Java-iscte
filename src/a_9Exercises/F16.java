package a_9Exercises;

public class F16 extends VeiculoAereo {
    private boolean isMissao;

    public F16(int capacidade) {
        super(capacidade);
    }

    public void setMissao(boolean missao) {
        isMissao = missao;
    }

    @Override
    public boolean addPessoa(Pessoa pessoa) {
        if(pessoa.isTrabalhaForcaAerea()) {
            return super.addPessoa(pessoa);
        }else{
            return false;
        }
    }

    @Override
    public int getConsumo() {
        if(isMissao) {
            return getConsumoBase() * 4;
        }else{
            return super.getConsumo();
        }
    }
}
