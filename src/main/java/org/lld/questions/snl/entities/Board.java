package org.lld.questions.snl.entities;

import java.util.*;
import java.util.stream.Collectors;

public class Board {
    private final Map<Integer, Integer> snakes;
    private final Map<Integer, Integer> ladders;
    private final Map<Integer, Integer> playerPositions = new HashMap<>();
    private final int winningPos;
    private final Dice dice;

    public Board(int n, List<Snakes> snakes, List<Ladder> ladders) {
        this.winningPos = n*n;
        this.snakes = snakes.stream().collect(Collectors.toMap(Snakes::getEndPos, Snakes::getStartPos));
        this.ladders = ladders.stream().collect(Collectors.toMap(Ladder::getStartPos, Ladder::getEndPos));
        this.dice = new SixSidedDice(); // Default to SixSidedDice
    }

    public Board(int n, List<Snakes> snakes, List<Ladder> ladders, Dice dice) {
        this.winningPos = n*n;
        this.snakes = snakes.stream().collect(Collectors.toMap(Snakes::getEndPos, Snakes::getStartPos));
        this.ladders = ladders.stream().collect(Collectors.toMap(Ladder::getStartPos, Ladder::getEndPos));
        this.dice = dice;
    }

    public int rollDice() {
        return dice.roll();
    }

    public synchronized int getPlayerPosition(int id) {
        return playerPositions.getOrDefault(id, 0);
    }

    public synchronized void setPlayerPosition(int id, int pos) {
        playerPositions.put(id, pos);
    }

    public Set<Integer> blockedPos() {
        return this.snakes.keySet();
    }

    public Integer getNewPositionAfterBite(int end) {
        return this.snakes.getOrDefault(end, -1);
    }

    public int getWinningPos() {
        return this.winningPos;
    }

    public int getNewPositionAfterLadder(int pos) {
        return this.ladders.getOrDefault(pos, -1);
    }

    public Set<Integer> getLadderPos() {
        return this.ladders.keySet();
    }

}
