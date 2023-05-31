package com.design.decorator;

/**
 * @author xpf
 * @since 2023/5/31
 */
public abstract class Border extends Display {
    protected Display display;

    public Border(Display display) {
        this.display = display;
    }
}
