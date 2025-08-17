package org.lld.questions.snl.entities;

import java.util.Random;

public class SixSidedDice implements Dice {
    private static final int SIDES = 6;
    private final Random random;

    public SixSidedDice() {
        this.random = new Random();
    }

    @Override
    public int roll() {
        return random.nextInt(SIDES) + 1;
    }
}
