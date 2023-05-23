package com.design.abstractfactory.factory;

/**
 * @author xpf
 * @since 2023/5/23
 */
public abstract class Link extends Item {

    protected String url;

    protected Link(String caption, String url) {
        super(caption);
        this.url = url;
    }
}
