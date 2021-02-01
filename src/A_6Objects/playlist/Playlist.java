package A_6Objects.playlist;


public class Playlist {

    private String name;
    private Song[] songs;


    public Playlist(Song[] songs,String name){
        this.name = name;
        replaceSongs(songs);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * replace all the songs inside a playlist with new ones
     * @param songs new songs
     */
    public void replaceSongs(Song[] songs){
        this.songs = new Song[songs.length];
        System.arraycopy(songs, 0, this.songs, 0, this.songs.length);
    }

    /**
     * Prints all the songs inside the playlist
     */
    public void getSongs(){
        System.out.println("The songs inside the play list are: ");
        for (int i = 0; i < songs.length; i++){
            if (isNull(songs[i])){
                System.out.println((i+1)+".- Null");
            }else {
               System.out.println((i+1)+".- "+songs[i].toString());
            }
        }
    }

    /**
     *
     * @param song a song to test
     * @return if the song exist or not
     */
    public boolean isNull(Song song) {
        return song == null;
    }

    /**
     * adds a song to the playlist
     * @param song song to add
     */
    public void addSong(Song song){
            Song[] copy = new Song[songs.length+1];
            int i;
            for (i = 0; i < this.songs.length; i++){
                copy[i] = songs[i];
            }
            copy[i] = song;
            replaceSongs(copy);
            System.out.println("Song "+this.songs[i].getTitle()+" was added to the playlist "+name+" successfully!");
    }

    /**
     * deletes a song from the playlist
     * @param song song to delete
     */
    public void deleteSong(Song song){
        int l = songs.length;
        Song[] copy = new Song[l-1];
        int i;
        for (i = 0; i < copy.length; i++){
            if(!songs[i].getTitle().equals(song.getTitle())){
                copy[i] = songs[i];
            }else{
                break;
            }
        }
        i++;
        for (; i <= copy.length; i++){
            copy[i-1] = songs[i];
        }
        replaceSongs(copy);
        System.out.println("Song "+song.getTitle()+" was removed from the playlist "+name+" successfully!");

    }

    /**
     *
     * @return the sum of all the songs in the play list
     */
    public String sumOfSongsLong(){
        int sum = 0;
        for (Song song : songs) {
            sum = sum + song.getLongS();
        }

        int minutes = sum/60;
        int seconds = sum%60;

        return minutes+":"+seconds;
    }

    @Override
    public String toString() {
        final String s = "Playlist " + name + '\n';
        getSongs();
        return s;
    }
}
