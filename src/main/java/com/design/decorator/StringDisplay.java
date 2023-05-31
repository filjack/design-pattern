package com.design.decorator;

/**
 * @author xpf
 * @since 2023/5/31
 */
public class StringDisplay extends Display {

    private String string;

    public StringDisplay(String s) {
        string = s;
    }

    @Override
    public int getRows() {
        return 1;
    }

    @Override
    public int getColumns() {
        return string.getBytes().length;
    }

    @Override
    public String getRowText(int row) {
        if (row == 0) {
            return string;
        }
        return null;
    }

}
