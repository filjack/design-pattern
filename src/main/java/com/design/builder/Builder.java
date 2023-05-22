package com.design.builder;

/**
 * @author xpf
 * @since 2023/5/22
 */
public abstract class Builder {
    public abstract void makeTitle(String title);

    public abstract void makeString(String str);

    public abstract void makeItems(String[] items);

    public abstract void close();
}
