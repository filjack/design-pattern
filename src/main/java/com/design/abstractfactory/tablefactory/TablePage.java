package com.design.abstractfactory.tablefactory;

import com.design.abstractfactory.factory.Item;
import com.design.abstractfactory.factory.Page;

/**
 * @author xpf
 * @since 2023/5/23
 */
public class TablePage extends Page {

    public TablePage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHTML() {
        StringBuilder builder = new StringBuilder();
        builder.append("<html><head><meta charset=\"UTF-8\"/><title>").append(title).append("</title></head>\n");
        builder.append("<body>\n");
        builder.append("<h1>").append(title).append("</h1>\n");
        builder.append("<table width=\"80%\" border=\"3\">\n");
        for (Item item : content) {
            builder.append("<tr>").append(item.makeHTML()).append("</tr>\n");
        }
        builder.append("</table>\n");
        builder.append("<hr><address>").append(author).append("</address>\n");
        builder.append("</body></html>");
        return builder.toString();
    }
}
