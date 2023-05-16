package com.design.adapter;

import java.io.IOException;

/**
 * @author xpf
 * @since 2023/5/16 22:57
 */
public interface FileIO {

    void readFromFile(String fileName) throws IOException;

    void writeToFile(String fileName) throws IOException;

    void setValue(String key, String value);

    String getValue(String key);

}
