package a_8AbstractMethodsAndClasses.chess;

public class Position {
    private final int x;
    private final int y;

    public Position(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getY(){return y;}
    public int getX(){return x;}

    /**
     *
     * @param x number of the x coordinate
     * @return the horizontal coordinate in chess
     */
    private char convertsPosToChar(int x){
        char[] abc={'A','B','C','D','E','F','G','H'};
        return abc[x];
    }

    /**
     *
     * @return the position coded in chess coordinates
     */
    @Override
    public String toString(){
        return "("+convertsPosToChar(getX())+","+(8-getY())+")";
    }
}
