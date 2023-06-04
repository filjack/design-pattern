package com.design.observer;

/**
 * @author xpf
 * @since 2023/6/4
 */
public class Main {
    public static void main(String[] args) {
        NumberGenerator generator = new RandomNumberGenerator();
        Observer observer1 = new DigitObserver();
        Observer observer2 = new GraphObserver();
        generator.addObserver(observer1);
        generator.addObserver(observer2);
        generator.execute();

        NumberGenerator generator2 = new IncrementalNumberGenerator(10, 50, 5);
        generator2.addObserver(observer1);
        generator2.addObserver(observer2);
        generator2.execute();
    }
}
