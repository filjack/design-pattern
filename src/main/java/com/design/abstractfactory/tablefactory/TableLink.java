package com.design.abstractfactory.tablefactory;

import com.design.abstractfactory.factory.Link;

/**
 * @author xpf
 * @since 2023/5/23
 */
public class TableLink extends Link {

    public TableLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return "<td><a href=\"" + url + "\">" + caption + "</a></td>\n";
    }
}
