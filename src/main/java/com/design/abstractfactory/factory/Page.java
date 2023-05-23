package com.design.abstractfactory.factory;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/**
 * @author xpf
 * @since 2023/5/23
 */
public abstract class Page {

    protected String title;
    protected String author;
    protected List<Item> content = new ArrayList<>();

    protected Page(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void add(Item item) {
        this.content.add(item);
    }

    public void output() {
        String fileName = this.title + ".html";
        try (Writer writer = new FileWriter(fileName)) {
            writer.write(this.makeHTML());
            System.out.println(fileName + "编写完成");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public abstract String makeHTML();

}
