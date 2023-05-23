package com.design.abstractfactory.listfactory;

import com.design.abstractfactory.factory.Link;

/**
 * @author xpf
 * @since 2023/5/23
 */
public class ListLink extends Link {

    public ListLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return "<li><a href=\"" + url + "\">" + caption + "</a></li>\n";
    }

}
