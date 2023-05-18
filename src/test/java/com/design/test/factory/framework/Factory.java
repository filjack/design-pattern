package com.design.test.factory.framework;


/**
 * @author xpf
 * @since 2023/5/18
 */
public abstract class Factory {

    public final Product create(String owner) {
        Product product = createProduct(owner);
        registerProduct(product);
        return product;
    }

    public abstract Product createProduct(String owner);

    public abstract void registerProduct(Product product);
}
