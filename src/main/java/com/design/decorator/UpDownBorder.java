package com.design.decorator;

/**
 * @author xpf
 * @since 2023/6/1
 */
public class UpDownBorder extends Border {

    private char borderChar;

    public UpDownBorder(Display display, char c) {
        super(display);
        borderChar = c;
    }

    @Override
    public int getRows() {
        return 1 + display.getRows() + 1;
    }

    @Override
    public int getColumns() {
        return display.getColumns();
    }

    @Override
    public String getRowText(int row) {
        if (row == 0 || row == display.getRows() + 1) {
            return makeLine('-', display.getColumns());
        } else {
            return display.getRowText(row - 1);
        }
    }

    private String makeLine(char c, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(c);
        }
        return sb.toString();
    }

}
