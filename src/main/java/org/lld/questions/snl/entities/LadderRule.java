package org.lld.questions.snl.entities;

public class LadderRule implements GameRule {
    @Override
    public int apply(Player player, Board board, int currentPosition, int tempPosition) {
        if (board.getLadderPos().contains(tempPosition)) {
            System.out.println("Climbing ladder for : " + player.getName() + " " + tempPosition + " " + board.getNewPositionAfterLadder(tempPosition));
            return board.getNewPositionAfterLadder(tempPosition);
        }
        return tempPosition;
    }
}
