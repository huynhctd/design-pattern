package iterator;

import java.util.Iterator;

public class SongIterator implements Iterator<Song> {

    protected Song[] songs;
    protected int currentSong = 0;

    public SongIterator(Song[] songs) {
        this.songs = songs;
    }

    @Override
    public boolean hasNext() {
        return (currentSong < songs.length && songs[currentSong] != null);
    }

    @Override
    public Song next() {
        return songs[currentSong++];
    }

}
