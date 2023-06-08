package com.design.flyweight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author xpf
 * @since 2023/6/8
 */
public class BigChar {

    private char charName;
    private String fontData;

    public BigChar(char charName) {
        this.charName = charName;
        try (BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/big" + charName + ".txt"))) {
            String line;
            StringBuilder buffer = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                buffer.append(line).append("\n");
            }
            this.fontData = buffer.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void print() {
        System.out.println(fontData);
    }

}
