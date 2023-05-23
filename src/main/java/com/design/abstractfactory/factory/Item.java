package com.design.abstractfactory.factory;


/**
 * @author xpf
 * @since 2023/5/23
 */
public abstract class Item {

    protected String caption;

    public Item(String caption) {
        this.caption = caption;
    }

    public abstract String makeHTML();

}
