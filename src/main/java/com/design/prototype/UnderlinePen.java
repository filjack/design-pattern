package com.design.prototype;

import com.design.prototype.framework.Product;

/**
 * @author xpf
 * @since 2023/5/20
 */
public class UnderlinePen extends Product {

    private char ulChar;

    public UnderlinePen(char c) {
        ulChar = c;
    }

    @Override
    public void use(String name) {
        int length = name.getBytes().length + 4;
        System.out.println(name);
        for (int i = 0; i < length; i++) {
            System.out.print(ulChar);
        }
        System.out.println();
    }

}
