package org.lld.questions.snl.entities;

public class Snakes {
    private final int startPos;
    private final int endPos;

    public Snakes(int start, int end) {
        this.startPos =start;
        this.endPos = end;
    }

    public int getEndPos() {
        return endPos;
    }

    public int getStartPos() {
        return startPos;
    }
}
