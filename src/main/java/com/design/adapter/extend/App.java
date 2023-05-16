package com.design.adapter.extend;

/**
 * @author xpf
 * @since 2023/5/16 22:34
 */
public class App {

    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printWeek();
        p.printStrong();
    }

}
