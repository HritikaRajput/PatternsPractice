package org.lld.questions.snl.entities;

public class SnakeRule implements GameRule {
    @Override
    public int apply(Player player, Board board, int currentPosition, int tempPosition) {
        if (board.blockedPos().contains(tempPosition)) {
            System.out.println("Snake bit, changing position: " + player.getName() + " " + tempPosition + " " + board.getNewPositionAfterBite(tempPosition));
            return board.getNewPositionAfterBite(tempPosition);
        }
        return tempPosition;
    }
}
