package iterator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Song> songSources =  new ArrayList<>();
        songSources.add(new Song("The Hobbit", "Atman", 200));
        songSources.add(new Song("Love Story", "TayLor", 400));
        songSources.add(new Song("My Love", "westlife", 999));
        songSources.add(new Song("Hey Jude", "The Beatles", 20000));
        songSources.add(new Song("Yesterday", "The Beatles", 900));

        SongLibrary songLibrary = new SongLibrary();
        SongStoreOfTheBeatles songStore = new SongStoreOfTheBeatles();

        songSources.forEach(
                song -> {
                    songLibrary.addSong(song);
                    songStore.addSong(song);
                }
        );

        System.out.println("Printing song details of Song Store Of The Beatles");
        System.out.println(
                "-------------------------------------------------------------------------------------------------");
        printBooks(songStore);
        System.out.println(
                "-------------------------------------------------------------------------------------------------");

        System.out.println("Printing song details of Song Library");
        System.out.println(
                "-------------------------------------------------------------------------------------------------");
        printBooks(songLibrary);
    }

    private static void printBooks(Iterable<Song> songs) {
        for (Song song : songs) {
            System.out.println(song);
        }
    }
}
