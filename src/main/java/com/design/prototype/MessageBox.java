package com.design.prototype;

import com.design.prototype.framework.Product;

/**
 * @author xpf
 * @since 2023/5/20
 */
public class MessageBox extends Product {

    private char decochar;

    public MessageBox(char decochar) {
        this.decochar = decochar;
    }

    @Override
    public void use(String name) {
        int length = name.getBytes().length + 4;
        for (int i = 0; i < length; i++) {
            System.out.print(decochar);
        }
        System.out.println();
        System.out.print(decochar + " " + name + " " + decochar);
        System.out.println();
        for (int i = 0; i < length; i++) {
            System.out.print(decochar);
        }
        System.out.println();
    }
}
