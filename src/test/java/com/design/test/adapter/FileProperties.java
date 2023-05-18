package com.design.test.adapter;

import com.design.test.adapter.FileIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author xpf
 * @since 2023/5/16 22:59
 */
public class FileProperties extends Properties implements FileIO {

    @Override
    public void readFromFile(String fileName) throws IOException {
        load(new FileInputStream(fileName));
    }

    @Override
    public void writeToFile(String fileName) throws IOException {
        store(new FileOutputStream(fileName), "written by FileProperties");
    }

    @Override
    public void setValue(String key, String value) {
        setProperty(key, value);
    }

    @Override
    public String getValue(String key) {
        return getProperty(key, "");
    }
}
