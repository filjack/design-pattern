package com.design.strategy;

/**
 * @author xpf
 * @since 2023/5/25
 */
public class Hand {
    /**
     * 石头
     */
    public static final int HAND_VALUE_GUU = 0;
    /**
     * 剪刀
     */
    public static final int HAND_VALUE_CHO = 1;
    /**
     * 布
     */
    public static final int HAND_VALUE_PAA = 2;

    protected static final Hand[] HANDS = {
            new Hand(HAND_VALUE_GUU),
            new Hand(HAND_VALUE_CHO),
            new Hand(HAND_VALUE_PAA)
    };

    private static final String[] NAME = {
            "石头", "剪刀", "布"
    };

    /**
     * 猜拳中出的手势的值
     */
    private final int handValue;
    private Hand(int value) {
        handValue = value;
    }

    public static Hand getHand(int handValue) {
        return HANDS[handValue];
    }

    public boolean isStrongerThan(Hand h) {
        return fight(h) == 1;
    }

    public boolean isWeakerThan(Hand h) {
        return fight(h) == -1;
    }

    /**
     * 平：0 胜：1 负：-1
     *
     * @param h 手势
     * @return 结果
     */
    private int fight(Hand h) {
        if (this == h) {
            return 0;
        } else if ((this.handValue + 1) % 3 == h.handValue) {
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return NAME[handValue];
    }
}
