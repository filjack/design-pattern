package com.design.bridge;

/**
 * @author xpf
 * @since 2023/5/24
 */
public class Display {

    private DisplayImpl impl;

    public Display(DisplayImpl impl) {
        this.impl = impl;
    }

    public void open() {
        impl.rowOpen();
    }

    public void print() {
        impl.rowPrint();
    }

    public void close() {
        impl.rowClose();
    }

    public final void display() {
        open();
        print();
        close();
    }

}
