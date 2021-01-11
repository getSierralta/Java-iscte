package aula10InterfacesComparadores;

public class Filme implements Comparable<Filme>{
	private String nome;
	private double score;
	private int ano;
	public Filme(String nome, double score, int ano) {
		this.nome = nome;
		this.score = score;
		this.ano = ano;
	}

	@Override
	public int compareTo(Filme outro) {
		if (outro.score > this.score){
			return 1;
		}else if(this.score > outro.score){
			return -1;
		}
		return 0;
	}

	@Override
	public String toString() {
		return "Filme{" +
				"nome = '" + nome + '\'' +
				", score = " + score +
				", ano = " + ano +
				'}';
	}
}
