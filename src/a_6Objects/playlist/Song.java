package a_6Objects.playlist;

public class Song {

    private final String title;
    private final String artist;
    private final int longS;

    public Song(String title, String artist, int longS){
        this.title = title;
        this.artist = artist;
        this.longS = longS;

    }
    public String getTitle(){
        return this.title;
    }
    public int getLongS(){
        return longS;
    }
    @Override
    public String toString(){
        int minutes = longS/60;
        int seconds = longS%60;
        return "Title: "+title+" - "+artist+".\nLong: "+minutes+":"+seconds;
    }
}
