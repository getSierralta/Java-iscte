package aula10InterfacesComparadores;

import aula10InterfacesComparadores.figures.Square;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Square square = new Square(4);
        System.out.println(square);
        Estudante [] st=new Estudante[3];
        st[0]=new Estudante(101,"Vijay",23);
        st[1]=new Estudante(106,"Ajay",27);
        st[2]=new Estudante(105,"Jay",21);
        Arrays.sort(st);
        System.out.println("Ordenado por idade");
        for(Estudante stu:st){
            System.out.println(stu.getRollno() + " " + stu.getNome() + "" + stu.getIdade());
        }


        Filme[] filmes = new Filme[4];
        filmes[0] = new Filme("Star Wars: Empire Strikes Back", 9.2, 1981);
        filmes[1] = new Filme("Force Awakens", 8, 2015);
        filmes[2]  = new Filme("Star Wars", 9, 1980);
        filmes[3] = new Filme("Return of The Jedi", 10, 1983);

        Arrays.sort(filmes);

        for (Filme filme: filmes) {
            System.out.print("\n"+filme);
        }

        Contact[] contacts = new Contact[5];
        contacts[0] = new Contact("Juan", 999_555_333);
        contacts[1] = new Contact("Juan", 111_666_777);
        contacts[2] = new Contact("Patricia", 888_555_666);
        contacts[3] = new Contact("Alberto", 666_888_999);
        contacts[4] = new Contact("José", 111_777_666);

        System.out.println("\n");
        Arrays.sort(contacts);
        for(Contact contact: contacts){
            System.out.println("\n"+contact);
        }
    }
}
