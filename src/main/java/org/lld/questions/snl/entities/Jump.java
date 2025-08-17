package org.lld.questions.snl.entities;

public abstract class Jump {
    private final int startPos;
    private final int endPos;
    private final String type;

    public Jump(int start, int end, String type) {
        this.startPos = start;
        this.endPos = end;
        this.type = type;
    }

    public int getEndPos() {
        return endPos;
    }

    public int getStartPos() {
        return startPos;
    }
}
