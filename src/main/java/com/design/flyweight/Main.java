package com.design.flyweight;

/**
 * @author xpf
 * @since 2023/6/8
 */
public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java Main digits");
            System.out.println("Example: java Main 1212123");
            System.exit(0);
        }
        BigString bigString = new BigString(args[0]);
        bigString.print();
    }
}
