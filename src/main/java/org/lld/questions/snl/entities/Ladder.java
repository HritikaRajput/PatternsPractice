package org.lld.questions.snl.entities;

public class Ladder {
    private final int startPos;
    private final int endPos;

    public Ladder(int start, int end) {
        this.startPos =start;
        this.endPos = end;
    }

    public int getEndPos(int startPos) {
        return endPos;
    }

    public int getEndPos() {
        return endPos;
    }
    public int getStartPos() {
        return startPos;
    }
}
