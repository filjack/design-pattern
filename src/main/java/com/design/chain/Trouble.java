package com.design.chain;

/**
 * @author xpf
 * @since 2023/6/3
 */
public class Trouble {
    /**
     * 问题编号
     */
    private int number;

    public Trouble(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Trouble{" +
                "number=" + number +
                '}';
    }
}
