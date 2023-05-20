package com.design.prototype.framework;

/**
 * @author xpf
 * @since 2023/5/20
 */
public abstract class ConcreteProduct implements Product{
    @Override
    public Product createClone() {
        Product product = null;
        try {
            product = (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return product;
    }
}
