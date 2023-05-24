package com.design.bridge;

/**
 * @author xpf
 * @since 2023/5/24
 */
public class IncreaseDisplay extends Display {

    public IncreaseDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void increaseDisplay(int times) {
        for (int i = 0; i < times; i++) {
            open();
            for (int j = 0; j < i; j++) {
                print();
            }
            close();
            System.out.println();
        }
    }

}
