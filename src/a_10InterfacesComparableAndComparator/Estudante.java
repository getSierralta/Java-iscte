package a_10InterfacesComparableAndComparator;

 public class Estudante implements Comparable<Estudante> {
	 int rollno;
	 String nome;
	 int idade;

	 public Estudante(int rollno, String nome, int idade) {
		 this.rollno = rollno;
		 this.nome = nome;
		 this.idade = idade;
	 }

	 public int getRollno() {
		 return rollno;
	 }

	 public String getNome() {
		 return nome;
	 }

	 public int getIdade() {
		 return idade;
	 }

	 public int compareTo(Estudante st) {
		 if (idade == st.idade) {
			 return 0;
		 }else if (idade > st.idade)
				 return 1;
			 else
				 return -1;
		 }
 }


