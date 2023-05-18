package com.design.factory;

import com.design.factory.framework.Factory;
import com.design.factory.framework.Product;
import com.design.factory.idcard.IDCardFactory;

/**
 * @author xpf
 * @since 2023/5/18
 */
public class App {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("小明");
        Product card2 = factory.create("小红");
        Product card3 = factory.create("小白");

        card1.use();
        card2.use();
        card3.use();
    }
}
