package com.design.singleton;

/**
 * @author xpf
 * @since 2023/5/19
 */
public class Singleton {

    private static final Singleton singleton = new Singleton();

    private Singleton() {
        System.out.println("获取了一个实例！");
    }

    public static Singleton getInstance() {
        return singleton;
    }

}
