package com.design.template;

/**
 * @author xpf
 * @since 2023/5/17 20:54
 */
public class CharDisplay extends AbstractDisplay {

    private char aChar;

    public CharDisplay(char aChar) {
        this.aChar = aChar;
    }

    @Override
    void open() {
        System.out.println("<<");
    }

    @Override
    void print() {
        System.out.println(aChar);
    }

    @Override
    void close() {
        System.out.println(">>");
    }
}
