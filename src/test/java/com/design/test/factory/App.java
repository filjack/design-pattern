package com.design.test.factory;

import com.design.test.factory.framework.Factory;
import com.design.test.factory.framework.Product;
import com.design.test.factory.idcard.IDCardFactory;

/**
 * @author xpf
 * @since 2023/5/18
 */
public class App {

    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("ming");
        Product card2 = factory.create("henry");
        Product card3 = factory.create("bob");

        card1.use();
        card2.use();
        card3.use();
    }

}
