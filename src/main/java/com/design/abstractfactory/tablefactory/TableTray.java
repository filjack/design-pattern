package com.design.abstractfactory.tablefactory;

import com.design.abstractfactory.factory.Item;
import com.design.abstractfactory.factory.Tray;

/**
 * @author xpf
 * @since 2023/5/23
 */
public class TableTray extends Tray {

    public TableTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuilder builder = new StringBuilder();
        builder.append("<td>\n");
        builder.append("<table width=\"100%\" border=\"1\"><tr>\n");
        builder.append("<td bgcolor=\"#cccccc\" align=\"center\" colspan=\"")
                .append(list.size()).append("\"><b>").append(caption).append("</b></td>\n");
        builder.append("</tr>\n");
        builder.append("<tr>\n");
        for (Item item : list) {
            builder.append(item.makeHTML());
        }
        builder.append("</tr></table>\n");
        builder.append("</td>\n");
        return builder.toString();
    }
}
