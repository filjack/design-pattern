package com.design.prototype.framework;

/**
 * @author xpf
 * @since 2023/5/20
 */
public interface Product extends Cloneable {

    public abstract void use(String name);

    public abstract Product createClone();
}
