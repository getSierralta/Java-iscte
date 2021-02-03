package a_10InterfacesComparableAndComparator;

public class Contact implements Comparable<Contact>{
    private String nome;
    private int telemovel;

    public Contact(String nome, int telemovel) {
        this.nome = nome;
        this.telemovel = telemovel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelemovel() {
        return telemovel;
    }

    public void setTelemovel(int telemovel) {
        this.telemovel = telemovel;
    }

    @Override
    public String toString() {
        return "Contact{" +
                " nome = '" + nome + '\'' +
                ", telemovel = " + telemovel +
                '}';
    }
    //● Deve redefinir o método equals e implementar o interface Comparable, sendo comparação por
    //ordem alfabética de nome;
    //● Inclua a possibilidade de pessoas com o mesmo nome serem ordenadas pelo número de telefone.

    @Override
    public int compareTo(Contact o) {
        if (this.getNome().equals(o.getNome())){
            return this.getTelemovel() - o.getTelemovel();
        }
        return this.getNome().compareTo(o.getNome());
    }


}
