package com.design.decorator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xpf
 * @since 2023/6/1
 */
public class MultiStringDisplay extends Display {

    private List<String> strings;
    private int col;

    public MultiStringDisplay() {
        strings = new ArrayList<>();
    }

    public void add(String s) {
        if (strings.isEmpty()) {
            this.col = s.length();
        } else {
            this.col = Math.max(this.col, s.length());
        }
        strings.add(s);
    }

    @Override
    public int getRows() {
        return strings.size();
    }

    @Override
    public int getColumns() {
        return col;
    }

    @Override
    public String getRowText(int row) {
        String content = strings.get(row);
        StringBuilder sb = new StringBuilder(content);
        if (content.length() < col) {
            for (int i = 0; i < col - content.length(); i++) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }
}
