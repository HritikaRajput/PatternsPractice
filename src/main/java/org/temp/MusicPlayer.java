package org.temp;

import java.util.*;


public class MusicPlayer {
    HashMap<String, Song> songs = new HashMap<>();
    HashMap<String, Integer> songPlayedCount = new HashMap<>();
    NavigableMap<Integer, TreeSet<String>> mostPlayedSongs = new TreeMap<>(Comparator.reverseOrder());
    HashMap<String, HashSet<String>> userStarredSongs = new HashMap<>();

    public void starSong(String songId, String userId) {
        userStarredSongs.computeIfAbsent(userId, k -> new HashSet<>()).add(songId);
    }

    public void unStarSong(String songId, String userId) {
        if(userStarredSongs.get(userId) != null) {
            HashSet<String> starredSongs = userStarredSongs.get(userId);
            starredSongs.remove(songId);
        }
    }

    public List<String> getLastNFavouriteSongs(String userId, int N) {

    }

    private Comparator<String> titleAwareIdComparator() {
        return (a,b) -> {
            if(a.equals(b)) return 0;
            String titlea = songs.get(a) != null ? songs.get(a).getTitle() : null;
            String titleb = songs.get(b) != null ? songs.get(b).getTitle() : null;
            if(titlea.compareTo(titleb) != 0)
                return titlea.compareTo(titleb);
            return a.compareTo(b);
        };
    }

    public void addSong(String songId, String title) {
        Song song = new Song(songId, title);
        songPlayedCount.putIfAbsent(songId, 0);
        songs.put(songId, song);
        mostPlayedSongs.computeIfAbsent(0, k -> new TreeSet<>(titleAwareIdComparator())).add(songId);
    }

    public void playSong(String songId, String userId) {
        Song song = songs.get(songId);
        if (song == null) {
            return;
        }

        int oldCount = this.songPlayedCount.getOrDefault(songId, 0);

        TreeSet<String> oldSet = mostPlayedSongs.get(oldCount);
        if(oldSet!= null) {
            oldSet.remove(songId);
            if(oldSet.isEmpty()) mostPlayedSongs.remove(oldCount);
        }

        int newCount = oldCount+1;
        songPlayedCount.put(songId, newCount);
        System.out.println(songPlayedCount);
        mostPlayedSongs.computeIfAbsent(newCount, k -> new TreeSet<>(titleAwareIdComparator())).add(songId);
    }
    void printAnalytics() {
        for(Map.Entry<Integer, TreeSet<String>> entry: mostPlayedSongs.entrySet()) {
            for(String song: entry.getValue()) {
                System.out.println(songs.get(song).getTitle() + " " + songPlayedCount.get(song));
            }
        }
    }
}
