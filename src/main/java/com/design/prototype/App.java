package com.design.prototype;

import com.design.prototype.framework.Manage;
import com.design.prototype.framework.Product;

/**
 * @author xpf
 * @since 2023/5/20
 */
public class App {
    public static void main(String[] args) {
        Manage manage = new Manage();
        MessageBox messageBox = new MessageBox('*');
        UnderlinePen underlinePen = new UnderlinePen('~');
        MessageBox messageBox1 = new MessageBox('/');

        manage.register("strong message", underlinePen);
        manage.register("warning box", messageBox);
        manage.register("slash box", messageBox1);

        Product p1 = manage.create("strong message");
        p1.use("Hello");
        Product p2 = manage.create("warning box");
        p2.use("Hello");
        Product p3 = manage.create("slash box");
        p3.use("Hello");
    }
}
