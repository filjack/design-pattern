package com.design.observer;

import java.util.Random;

/**
 * @author xpf
 * @since 2023/6/4
 */
public class RandomNumberGenerator extends NumberGenerator {

    private Random random = new Random();
    private int num;

    @Override
    public int getNumber() {
        return num;
    }

    @Override
    public void execute() {
        for (int i = 0; i < 20; i++) {
            num = random.nextInt(50);
            notifyObservers();
        }
    }
}
