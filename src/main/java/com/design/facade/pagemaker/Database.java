package com.design.facade.pagemaker;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author xpf
 * @since 2023/6/3
 */
public class Database {
    private Database() {

    }

    public static Properties getProperties(String dbName) {
        String fileName = "src/main/resources/" + dbName + ".txt";
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }

}
