package com.design.decorator;

/**
 * 展示类
 *
 * @author xpf
 * @since 2023/5/31
 */
public abstract class Display {
    /**
     * 获取行数
     *
     * @return
     */
    public abstract int getRows();

    /**
     * 获取列数
     *
     * @return
     */
    public abstract int getColumns();

    /**
     * 获取row行的内容
     *
     * @param row 行号
     * @return
     */
    public abstract String getRowText(int row);

    public final void show() {
        for (int i = 0; i < getRows(); i++) {
            System.out.println(getRowText(i));
        }
    }
}
