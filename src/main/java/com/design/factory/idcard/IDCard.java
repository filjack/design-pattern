package com.design.factory.idcard;

import com.design.factory.framework.Product;

/**
 * @author xpf
 * @since 2023/5/18
 */
public class IDCard extends Product {

    private String owner;

    public IDCard(String owner) {
        System.out.println("制作" + owner + "的ID片");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println("使用" + owner + "的ID片");
    }

    public String getOwner() {
        return owner;
    }
}
