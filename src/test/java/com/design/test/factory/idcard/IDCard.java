package com.design.test.factory.idcard;

import com.design.test.factory.framework.Product;

/**
 * @author xpf
 * @since 2023/5/18
 */
public class IDCard extends Product {

    private String owner;
    private Integer no;

    IDCard(String owner, Integer no) {
        this.owner = owner;
        this.no = no;
        System.out.println("制作" + owner + "的卡片，编号为" + no);
    }

    @Override
    public void use() {
        System.out.println("使用" + owner + "的卡片，编号为" + no);
    }

    public String getOwner() {
        return owner;
    }

    public Integer getNo() {
        return no;
    }
}
