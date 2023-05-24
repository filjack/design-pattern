package com.design.bridge;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author xpf
 * @since 2023/5/24
 */

public class TextDisplayImpl extends DisplayImpl {

    private static final int MAX_READ_CACHE = 4096;

    private String fileName;

    private BufferedReader reader;

    public TextDisplayImpl(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void rowOpen() {
        System.out.println(fileName + " open!");
        try {
            reader = new BufferedReader(new FileReader(fileName));
            reader.mark(MAX_READ_CACHE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void rowPrint() {
        String line;
        try {
            reader.reset();
            while ((line = reader.readLine()) != null) {
                System.out.println("> " + line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void rowClose() {
        System.out.println(fileName + "close!");
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
