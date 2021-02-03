package a_8AbstractMethodsAndClasses.chess;

public class Knight extends Piece {
    public Knight(int pos_x, int pos_y, boolean white){
        super(pos_x,pos_y,white);
    }

    /**
     *
     * @return all the possible moves of a Knight depending on it's position in the board
     */
    @Override
    public Position[] possibleMovements() {
        int x=getPos().getX();
        int y= getPos().getY();
        return new Position[]{
                new Position(x-1,y-2),
                new Position(x-2,y-1),
                new Position(x+1,y-2),
                new Position(x+2,y-1),
                new Position(x-1,y+2),
                new Position(x-2,y+1),
                new Position(x+1,y+2),
                new Position(x+2,y+1)
        };


    }
}
