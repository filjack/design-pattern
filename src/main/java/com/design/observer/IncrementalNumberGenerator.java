package com.design.observer;

/**
 * @author xpf
 * @since 2023/6/4
 */
public class IncrementalNumberGenerator extends NumberGenerator {

    private int start;
    private int end;
    private int step;

    private int number;

    public IncrementalNumberGenerator(int start, int end, int step) {
        this.start = start;
        this.end = end;
        this.step = step;
    }

    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public void execute() {
        for (int i = start; i < end; i += step) {
            number = i;
            notifyObservers();
        }
    }
}
