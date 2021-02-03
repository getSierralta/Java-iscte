package a_8AbstractMethodsAndClasses.chess;

public abstract class Piece {

    private final Position pos;
    private final boolean white;

    public Piece(int pos_x, int pos_y, boolean white){
        this.pos = new Position(pos_x,pos_y);
        this.white=white;
    }

    /**
     *
     * @return coordinates of the piece
     */
    public Position getPos(){
        return pos;
    }

    /**
     *
     * @return whether the piece is white or black, true = white
     */
    public boolean isWhite(){
        return white;
    }

    public abstract Position[] possibleMovements();

    @Override
    public String toString(){
        StringBuilder returns = new StringBuilder("Possible movements of the piece: ");
        for(Position position : possibleMovements()){
            returns.append(position).append(",");
        }
        return returns.toString();
    }



}
