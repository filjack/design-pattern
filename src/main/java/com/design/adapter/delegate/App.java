package com.design.adapter.delegate;

/**
 * @author xpf
 * @since 2023/5/16 22:41
 */
public class App {

    public static void main(String[] args) {
        Print p = new PrintBanner(new Banner("Hello"));
        p.printStrong();
        p.printWeek();
    }

}
