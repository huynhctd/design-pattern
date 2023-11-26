package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SongLibrary implements Iterable<Song>{
    protected List<Song> songs;

    public SongLibrary() {
        super();
        songs = new ArrayList<>();
    }

    public boolean addSong(String name, String author, double price) {
        Song book = new Song(name, author, price);
        return songs.add(book);
    }

    public boolean addSong(Song song) {
        return songs.add(song);
    }

    public List<Song> getSongs() {
        return songs;
    }


    @Override
    public Iterator<Song> iterator() {
        return songs.iterator();
    }
}
