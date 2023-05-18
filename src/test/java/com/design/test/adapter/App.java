package com.design.test.adapter;

import java.io.IOException;

/**
 * @author xpf
 * @since 2023/5/16 22:58
 */
public class App {

    public static void main(String[] args) {
        FileIO f = new FileProperties();
        try {
            f.readFromFile("src/test/resources/file.txt");
            f.setValue("year", "2004");
            f.setValue("month", "4");
            f.setValue("day", "21");
            f.writeToFile("src/test/resources/newfile.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
