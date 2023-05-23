package com.design.abstractfactory.listfactory;

import com.design.abstractfactory.factory.Item;
import com.design.abstractfactory.factory.Tray;


/**
 * @author xpf
 * @since 2023/5/23
 */
public class ListTray extends Tray {

    public ListTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuilder builder = new StringBuilder();
        builder.append("<li>\n");
        builder.append(caption).append("\n");
        builder.append("<ul>\n");
        for (Item item : this.list) {
            builder.append(item.makeHTML());
        }
        builder.append("</ul>\n");
        builder.append("</li>\n");
        return builder.toString();
    }
}
