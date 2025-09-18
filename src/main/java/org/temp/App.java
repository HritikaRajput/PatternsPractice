package org.temp;

public class App {
    public static void main(String[] args) {
        MusicPlayer mp = new MusicPlayer();
        mp.addSong("s1", "Believer");
        mp.addSong("s2", "Shape of You");

        mp.playSong("s1", "u1");
        mp.playSong("s1", "u2");
        mp.playSong("s2", "u1");
        mp.playSong("s1", "u1");

        mp.printAnalytics();
    }
}
