package org.lld.questions.snl.entities;

public interface GameRule {
    int apply(Player player, Board board, int currentPosition, int tempPosition);
}
