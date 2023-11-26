package iterator;

import java.util.Iterator;

public class SongStoreOfTheBeatles implements Iterable<Song>{
   public static final String THE_BEATLES = "The Beatles";
    protected static int MAX_SONGS = 1000;
    protected int totalSongs = 0;
    protected Song[] songs;

    public SongStoreOfTheBeatles() {
        super();
        songs = new Song[MAX_SONGS];
    }

    public boolean addSong(String name, String author, double price) {
        Song song = new Song(name, author, price);
        if (totalSongs < (MAX_SONGS - 1)) {
            songs[totalSongs++] = song;
            return true;
        } else {
            System.out.println("SongStore is full and can't accept any more songs!");
            return false;
        }
    }

    public boolean addSong(Song song) {
        if (totalSongs < (MAX_SONGS - 1) ) {
            if (song.getSingle().equals(THE_BEATLES)) {
                songs[totalSongs++] = song;
                return true;
            } else return false;
        } else {
            System.out.println("SongStore is full and can't accept any more songs!");
            return false;
        }
    }

    public Song[] getSongs() {
        return songs;
    }

    @Override
    public Iterator<Song> iterator() {
        return new SongIterator(songs);
    }
}
