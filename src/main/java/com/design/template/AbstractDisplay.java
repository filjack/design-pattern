package com.design.template;

/**
 * @author xpf
 * @since 2023/5/17 20:50
 */
public abstract class AbstractDisplay {
    abstract void open();

    abstract void print();

    abstract void close();

    final void display() {
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }
}
