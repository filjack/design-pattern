package com.design.singleton;

/**
 * @author xpf
 * @since 2023/5/19
 */
public class App {

    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        System.out.println(obj1 == obj2);
    }

}
