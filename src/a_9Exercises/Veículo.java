package a_9Exercises;

public abstract class Veículo {
    private Pessoa[] passageiros;
    private int consumo = 5;

    public Veículo(int capacidade) {
        passageiros = new Pessoa[capacidade];
    }

    public abstract int getConsumo();

    public boolean addPessoa(Pessoa pessoa) {
        if ((getLotacao() == 0 && pessoa.isTemCartaDeConducao())
                || (getLotacao() > 0 && getLotacao() != getCapacidade())) {
            for (int i = 0; i < passageiros.length; i++) {
                if (passageiros[i] == null) {
                    passageiros[i] = pessoa;
                    return true;
                }
            }
        }
        return false;
    }

    public boolean removePessoa(Pessoa pessoa) {
        // Ver se é condutor
        if (pessoa.isTemCartaDeConducao() && getCondutores() == 1) {
            // Não podemos remover porque é o único condutor no veículo
            return false;
        }
        for (int i = 0; i < passageiros.length; i++) {
            if (passageiros[i] != null && passageiros[i].equals(pessoa)) {
                passageiros[i] = null;
                return true;
            }
        }
        return false;
    }

    private int getCondutores() {
        int total = 0;
        for (int i = 0; i < passageiros.length; i++) {
            if (passageiros[i] != null && passageiros[i].isTemCartaDeConducao()) {
                total++;
            }
        }
        return total;
    }

    public int getLotacao() {
        int total = 0;
        for (int i = 0; i < passageiros.length; i++) {
            if (passageiros[i] != null) {
                total++;
            }
        }
        return total;
    }

    public void listarPassageiros() {
        for (int i = 0; i < passageiros.length; i++) {
            System.out.println(passageiros[i]);
        }
    }

    protected int getConsumoBase() {
        return consumo;
    }

    protected int getCapacidade() {
        return passageiros.length;
    }

}
