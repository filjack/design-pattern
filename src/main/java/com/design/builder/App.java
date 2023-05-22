package com.design.builder;

/**
 * @author xpf
 * @since 2023/5/22
 */
public class App {

    public static void main(String[] args) {
        TextBuilder textBuilder = new TextBuilder();
        Director director = new Director(textBuilder);
        director.construct();
        System.out.println(textBuilder.getResult());

        HTMLBuilder htmlBuilder = new HTMLBuilder();
        Director director1 = new Director(htmlBuilder);
        director1.construct();
        System.out.println(htmlBuilder.getResult());

        XmlBuilder xmlBuilder = new XmlBuilder();
        Director director2 = new Director(xmlBuilder);
        director2.construct();
        System.out.println(xmlBuilder.getResult());

    }

    public static void usage() {
        System.out.println("Usage: java Main plain");
        System.out.println("Usage: java Main html");
    }

}
