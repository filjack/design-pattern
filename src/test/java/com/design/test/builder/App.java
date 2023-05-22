package com.design.test.builder;

import com.design.builder.Director;
import com.design.builder.TextBuilder;

/**
 * @author xpf
 * @since 2023/5/22
 */
public class App {

    public static void main(String[] args) {
        com.design.builder.TextBuilder textBuilder = new TextBuilder();
        com.design.builder.Director director = new Director(textBuilder);
        director.construct();
        System.out.println(textBuilder.getResult());
    }

}
