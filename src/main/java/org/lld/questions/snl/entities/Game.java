package org.lld.questions.snl.entities;

import java.util.List;

public class Game {
    private static Game game;
    private List<ConcretePlayer> playerList;
    private Board board;
    private static ConcretePlayer currentPlayer;
    private static boolean hasStarted = false;
    private static boolean hasEnded = false;

    public Game(List<ConcretePlayer> playerList, Board board) throws Exception {
        this.playerList = playerList;
        if(playerList.size() ==0 ) {
            throw new Exception("Players not added");
        }
        currentPlayer = playerList.get(0);
        this.board = board;
    }

    public synchronized void start() {
        hasStarted = true;
    }

    public synchronized void roll() throws InterruptedException {
        while(!hasEnded) {
            Integer rolledNo = board.rollDice();
            System.out.println("Player playing dice: "+ currentPlayer.getName() + " " + rolledNo);

            Integer tempPosition = board.getPlayerPosition(currentPlayer.getId()) + rolledNo;
            if(board.blockedPos().contains(tempPosition)) { // kat gaya
                Integer finalPosition = board.getNewPositionAfterBite(tempPosition);
                System.out.println("Snake bit, changing position: " + currentPlayer.getName()+ " " + tempPosition + " " + finalPosition);
                board.setPlayerPosition(currentPlayer.getId(), finalPosition);
                this.endTurn();
                continue;
            }

            if(board.getLadderPos().contains(tempPosition)) {
                System.out.println("Climbing ladder for : " + currentPlayer.getName() + " " + tempPosition + " "+ board.getNewPositionAfterLadder(tempPosition));
                tempPosition = board.getNewPositionAfterLadder(tempPosition);
            }
            board.setPlayerPosition(currentPlayer.getId(), tempPosition);
            System.out.println("Player current position: "+ currentPlayer.getName() + " " + tempPosition);
            Thread.sleep(100);

            if(this.hasPlayerWon())
                endGame();

            if(rolledNo == 6) {
                continue;
            }
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
