package aula10InterfacesComparadores;

import java.util.Arrays;
import java.util.Comparator;

public class Livro {

	public static void main(String[] args) {
		Livro[] livros = new Livro[5];
		livros[0]=new Livro("The Shinning",1990, "Texto", "Stephen King");
		livros[1]=new Livro("Harry Potter e a Pedra Filosofal", 2001, "ASA", "Joanne Rowling");
		livros[2]=new Livro("O Inferno de Dante", 1472, "Bertrand", "Dante");
		livros[3]=new Livro("Conde de Monte Cristo", 1844, "Texto", "Alexandre Dumas");
		livros[4]=new Livro("Desenhar Bases de Dados", 2016, "Texto", "Pedro Nogueira");
		printLivros(livros);
		Arrays.sort(livros, new ComparadorNome());
		printLivros(livros);
		Arrays.sort(livros, new ComparadorAutor());
		printLivros(livros);

		//é possivel utilizar o Comparador.comparing
		//que vai buscar a propriedade diretamente
		//ao objeto (Livro::getAutor)
		//e invoca dinamicamente
		Arrays.sort(livros, Comparator.comparingInt(Livro::getData));
		printLivros(livros);
	}
	public static void printLivros(Livro[] livros){
		System.out.println("\n");
		for (Livro livro: livros){
			System.out.println(livro);
		}
	}

	private final String nome;
	private final int data;
	private final String texto;
	private final String autor;

	public Livro(String nome, int data, String texto, String autor) {
		this.nome = nome;
		this.data = data;
		this.texto = texto;
		this.autor = autor;
	}

	public String getNome() {
		return nome;
	}


	public int getData() {
		return data;
	}
	public String getAutor() {
		return autor;
	}


	@Override
	public String toString() {
		return "Livro{" +
				" nome = '" + nome + '\'' +
				", data = " + data +
				", texto = '" + texto + '\'' +
				", autor = '" + autor + '\'' +
				'}';
	}
}
class ComparadorNome implements Comparator<Livro> {

	@Override
	public int compare(Livro o1, Livro o2) {

		return o1.getNome().compareTo(o2.getNome());
	}
}
class ComparadorAutor implements Comparator<Livro> {

	@Override
	public int compare(Livro o1, Livro o2) {

		return o1.getAutor().compareTo(o2.getAutor());
	}
}


