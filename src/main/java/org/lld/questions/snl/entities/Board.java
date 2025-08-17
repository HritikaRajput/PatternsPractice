package org.lld.questions.snl.entities;

import java.util.*;
import java.util.stream.Collectors;

public class Board {
    private final int size;
    private final Set<Snakes> snakes;
    private final Set<Ladder> ladders;
    private final Map<Integer, Integer> playerPositions = new HashMap<>();
    private final int winningPos;
    private final int dice;

    public Board(int n, List<Snakes> snakes, List<Ladder> ladders) {
        this.size = n * n;
        this.winningPos = n*n;
        this.snakes = new HashSet<>(snakes);
        this.ladders = new HashSet<>(ladders);
        this.dice = 6;
    }

    public int rollDice() {
        return (int)(Math.random() * dice);
    }

    public synchronized int getPlayerPosition(int id) {
        return playerPositions.getOrDefault(id, 0);
    }

    public synchronized void setPlayerPosition(int id, int pos) {
        playerPositions.put(id, pos);
    }

    public Set<Integer> blockedPos() {
        return this.snakes.stream().map(snakes1 -> snakes1.getEndPos()).collect(Collectors.toSet());
    }

    public Integer getNewPositionAfterBite(int end) {
        for(Snakes snakes1: snakes) {
            if(snakes1.getEndPos() == end) {
                return snakes1.getStartPos(end);
            }
        }
        return -1;
    }

    public int getWinningPos() {
        return this.winningPos;
    }

    public int getNewPositionAfterLadder(int pos) {
        for(Ladder ladder: ladders) {
            if(ladder.getStartPos() == pos) {
                return ladder.getEndPos();
            }
        }
        return -1;
    }

    public Set<Integer> getLadderPos() {
        return this.ladders.stream().map(ladder -> ladder.getStartPos()).collect(Collectors.toSet());
    }

}
