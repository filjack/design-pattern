package com.design.strategy;

import java.util.Random;

/**
 * @author xpf
 * @since 2023/5/25
 */
public class WinningStrategy implements Strategy {

    private final Random random;
    private boolean won = false;
    private Hand prevHand;

    public WinningStrategy(int seed) {
        random = new Random(seed);
    }

    @Override
    public Hand nextHand() {
        if (!won) {
            prevHand = Hand.getHand(random.nextInt(3));
        }
        return prevHand;
    }

    @Override
    public void study(boolean win) {
        won = win;
    }
}
