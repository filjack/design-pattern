package com.design.state;

/**
 * @author xpf
 * @since 2023/6/7
 */
public class Main {
    public static void main(String[] args) {
        SafeFrame safeFrame = new SafeFrame("State Sample");
        while (true) {
            for (int hour = 0; hour < 24; hour++) {
                safeFrame.setClock(hour);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
            }
        }
    }
}
