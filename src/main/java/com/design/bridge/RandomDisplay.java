package com.design.bridge;

import java.util.Random;

/**
 * @author xpf
 * @since 2023/5/24
 */
public class RandomDisplay extends CountDisplay {

    private static final Random RANDOM = new Random();

    public RandomDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void randomDisplay(int times) {
        multiDisplay(RANDOM.nextInt(times));
    }

}
