package org.temp;

import java.util.concurrent.atomic.AtomicInteger;

public class Song {
    private String id;
    private AtomicInteger playedCount;
    private String title;
    
    Song(String id, String title) {
        this.id = id;
        this.title = title;
        this.playedCount =new AtomicInteger(0);
    }

    public synchronized int increasePlayedCount() {
        return this.playedCount.incrementAndGet();
    }

    public void updateSong(String title) {
        this.title = title;
    }
    public int getCount() {
        return this.playedCount.get();
    }
    public String getTitle() {
        return this.title;
    }
}
