package com.design.decorator;

/**
 * 装饰类
 *
 * @author xpf
 * @since 2023/5/31
 */
public abstract class Border extends Display {
    /**
     * 表示被装饰物，可能是一个被装饰物，也可能是一个装饰物（嵌套）
     */
    protected Display display;

    public Border(Display display) {
        this.display = display;
    }
}
