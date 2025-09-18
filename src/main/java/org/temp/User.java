package org.temp;

import java.util.ArrayList;
import java.util.List;

public class User {
    private int userId;
    private String name;
    private List<String> playedSongIds;

    User(int userId, String n) {
        this.userId = userId;
        this.name = n;
        this.playedSongIds = new ArrayList<>();
    }

    public void addToPlayedSongs(String songId) {

    }
}
