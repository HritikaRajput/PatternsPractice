package org.lld.questions.snl.entities;

import java.util.List;

public class Game {
    private static volatile Game game;
    private List<Player> playerList;
    private Board board;
    private Player currentPlayer;
    private boolean hasEnded = false;
    private List<GameRule> gameRules;

    private Game(List<Player> playerList, Board board) throws Exception {
        this.playerList = playerList;
        if(playerList.size() ==0 ) {
            throw new Exception("Players not added");
        }
        this.currentPlayer = playerList.get(0);
        this.board = board;
    }

    public static Game getInstance(List<Player> playerList, Board board) throws Exception {
        if (game == null) {
            synchronized (Game.class) {
                if (game == null) {
                    game = new Game(playerList, board);
                }
            }
        }
        return game;
    }

    public static Game getInstance(List<Player> playerList, Board board, List<GameRule> gameRules) throws Exception {
        if (game == null) {
            synchronized (Game.class) {
                if (game == null) {
                    game = new Game(playerList, board, gameRules);
                }
            }
        }
        return game;
    }

    private Game(List<Player> playerList, Board board, List<GameRule> gameRules) throws Exception {
        this(playerList, board);
        this.gameRules = gameRules;
    }

    public synchronized void roll() throws InterruptedException {
        while (!hasEnded) {
            Integer rolledNo = board.rollDice();
            System.out.println("Player playing dice: "+ currentPlayer.getName() + " " + rolledNo);

            Integer tempPosition = board.getPlayerPosition(currentPlayer.getId()) + rolledNo;
            for (GameRule rule : gameRules) {
                tempPosition = rule.apply(currentPlayer, board, board.getPlayerPosition(currentPlayer.getId()), tempPosition);
            }
            board.setPlayerPosition(currentPlayer.getId(), tempPosition);
            System.out.println("Player current position: "+ currentPlayer.getName() + " " + tempPosition);
            Thread.sleep(100);

            if(this.hasPlayerWon())
                endGame();


            this.endTurn();
        }
    }

    synchronized private void endTurn() {
        Integer currentId = currentPlayer.getId();
        Integer nextId = (currentId+1) % playerList.size();
        currentPlayer = playerList.get(nextId);
    }

    synchronized void endGame() {
        hasEnded = true;
        System.out.println(currentPlayer.getName() + " has won the game");
    }

    boolean hasPlayerWon() {
        Integer currentId = currentPlayer.getId();
        return board.getPlayerPosition(currentId) >= board.getWinningPos();
    }
 }
