package com.design.abstractfactory.tablefactory;


import com.design.abstractfactory.factory.Factory;
import com.design.abstractfactory.factory.Link;
import com.design.abstractfactory.factory.Page;
import com.design.abstractfactory.factory.Tray;

/**
 * @author xpf
 * @since 2023/5/23
 */
public class TableFactory extends Factory {

    @Override
    public Link createLink(String caption, String url) {
        return new TableLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new TableTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new TablePage(title, author);
    }
}
