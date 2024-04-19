package Section_8.CE46_Playlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name, artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        songs = new ArrayList<Song>();
    }

    public boolean addSong(String title, double duration) {
        if (findSong(title) == null) {
            return songs.add(new Song(title, duration));
        }
        return false;
    }

    private Song findSong(String title) {
        for (Song song : songs) {
            if (song.getTitle().equals(title)) {
                return song;
            }
        }
        return null;
    }

    public boolean addToPlayList(int track, LinkedList<Song> playList) {
        if (0 < track && track-1 < songs.size()) {
            return playList.add(songs.get(track - 1));
        }
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList) {
        if (findSong(title) != null) {
            return playList.add(findSong(title));
        }
        return false;
    }
}
