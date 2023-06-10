package com.design.proxy;

/**
 * @author xpf
 * @since 2023/6/10
 */
public class Main {
    public static void main(String[] args) {
        Printable p = new PrintProxy("Alice");
        System.out.println("现在的名字是" + p.getPrintName() + "。");
        p.setPrinterName("Bob");
        System.out.println("现在的名字是" + p.getPrintName() + "。");
        p.print("Hello World!");
    }
}
