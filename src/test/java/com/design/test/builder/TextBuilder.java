package com.design.test.builder;

/**
 * @author xpf
 * @since 2023/5/22
 */
public class TextBuilder extends Builder {

    private static StringBuilder builder = new StringBuilder();

    @Override
    protected void buildTitle(String title) {
        builder.append("========================================\n");
        builder.append("[" + title + "]\n");
        builder.append("\n");
    }

    @Override
    protected void buildString(String str) {
        builder.append("*" + str + "\n");
        builder.append("\n");
    }

    @Override
    protected void buildItems(String[] items) {
        for (int i = 0; i < items.length; i++) {
            builder.append(" -" + items[i] + "\n");
        }
        builder.append("\n");
    }

    @Override
    protected void buildDone() {
        builder.append("========================================\n");
    }

    public String getResult() {
        return builder.toString();
    }

}
