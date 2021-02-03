package a_6Objects.playlist;

public class Main {

    public static void main(String[] args) {
        Song a = new Song("All Star","Smash Mouth",236);
        Song b = new Song("Mom's Spaghetti","Eminem",278);
        Song c = new Song("Krusty Crab Pizza Song (dubstep remix)","Unknown",148);
        Song d = new Song("KILL YOURSELF","Pink Guy",156);
        Song e = new Song("Never Gonna Give You Up","Rick Astley",213);
        Song f = new Song("Sandroll","Groboclone",195);
        Song g = new Song("The 7th Element","Vitas",249);
        Song h = new Song("Spooky Boy","Dany Gonzales",161);
        Song i = new Song("Super Freak","Rick James",202);
        Song j = new Song("We Are Number One","Lazy Town",171);
        Song[] classicalSongs = new Song[2];
        classicalSongs[0] = a;
        classicalSongs[1] = b;
        Playlist pA = new Playlist(classicalSongs,"Classical Music");

        pA.getSongs();
        pA.addSong(c);
        pA.addSong(d);
        pA.addSong(e);
        pA.addSong(f);
        pA.addSong(g);
        pA.getSongs();
        pA.deleteSong(a);
        pA.deleteSong(b);
        pA.deleteSong(c);
        pA.getSongs();
        pA.addSong(h);
        pA.addSong(i);
        pA.addSong(j);
        pA.addSong(a);
        pA.getSongs();
        System.out.println(pA.sumOfSongsLong());
    }
}
