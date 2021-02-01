package A_8AbstractMethodsAndClasses.chess;

public class Pawn extends Piece {
    public Pawn(int pos_x, int pos_y, boolean white){
        super(pos_x,pos_y,white);
    }
    /**
     *
     * @return all the possible moves of a Pawn depending on it's position in the board
     */
    @Override
    public Position[] possibleMovements() {
        if (isWhite()) { // White Piece
            if (getPos().getY() == 6) { //If its the first move of the pawn then it can move twice
                return new Position[]{
                        new Position(getPos().getX(), 5),
                        new Position(getPos().getY(), 4)
                };
            } else {
                return new Position[]{
                        new Position(getPos().getX(), getPos().getY() - 1)
                };
            }

        } else { // Black Piece
            if (getPos().getY() == 1) { //If its the first move of the pawn then it can move twice
                return new Position[]{
                        new Position(getPos().getX(), 2),
                        new Position(getPos().getY(), 3)
                };
            } else {
                return new Position[]{
                        new Position(getPos().getX(), getPos().getY() + 1)
                };
            }


        }


    }}
