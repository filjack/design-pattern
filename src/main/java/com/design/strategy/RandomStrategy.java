package com.design.strategy;

import java.util.Random;

/**
 * @author xpf
 * @since 2023/5/25
 */
public class RandomStrategy implements Strategy {

    private final Random random;

    public RandomStrategy(int seed) {
        random = new Random(seed);
    }

    @Override
    public Hand nextHand() {
        return Hand.getHand(random.nextInt(3));
    }

    @Override
    public void study(boolean win) {
    }
}
