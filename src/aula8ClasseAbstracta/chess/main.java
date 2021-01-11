package aula8ClasseAbstracta.chess;

public class main {
    public static void main(String[] args) {
        Knight knight = new Knight(3, 4, true);
        Pawn pawn = new Pawn(1, 1, false);
        Pawn pawn2 = new Pawn(4, 2, true);

        System.out.println(knight);
        System.out.println(pawn);
        System.out.println(pawn2);
    }

}
