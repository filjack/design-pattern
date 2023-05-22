package com.design.builder;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author xpf
 * @since 2023/5/22
 */
public class XmlBuilder extends Builder {

    private String fileName;
    private PrintWriter writer;

    @Override
    public void makeTitle(String title) {
        String fileName = title + ".xml";
        try {
            writer = new PrintWriter(new FileWriter(fileName));
            writer.println("<title>" + title + "</title>\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void makeString(String str) {
        writer.println("<sp>" + str + "</sp>\n");
    }

    @Override
    public void makeItems(String[] items) {
        for (String item : items) {
            writer.println("<item>" + item + "</item>\n");
        }
    }

    @Override
    public void close() {
        writer.println("</body>\n");
        writer.close();
    }

    public String getResult() {
        return fileName;
    }

}
