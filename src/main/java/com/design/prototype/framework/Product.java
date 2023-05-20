package com.design.prototype.framework;

/**
 * @author xpf
 * @since 2023/5/20
 */
public interface Product extends Cloneable {

    void use(String name);

    Product createClone();

}
