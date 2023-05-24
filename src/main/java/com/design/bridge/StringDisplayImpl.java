package com.design.bridge;

/**
 * @author xpf
 * @since 2023/5/24
 */
public class StringDisplayImpl extends DisplayImpl {

    private String string;
    private int width;

    public StringDisplayImpl(String s) {
        string = s;
        width = s.getBytes().length;
    }

    @Override
    public void rowOpen() {
        printLine();
    }

    @Override
    public void rowPrint() {
        System.out.println("|" + string + "|");
    }

    @Override
    public void rowClose() {
        printLine();
    }

    private void printLine() {
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }

}
