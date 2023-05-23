package com.design.abstractfactory.listfactory;

import com.design.abstractfactory.factory.Factory;
import com.design.abstractfactory.factory.Link;
import com.design.abstractfactory.factory.Page;
import com.design.abstractfactory.factory.Tray;

/**
 * @author xpf
 * @since 2023/5/23
 */
public class ListFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}
