package com.design.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author xpf
 * @since 2023/5/25
 */
public class Directory extends Entry {

    /**
     * 文件夹名字
     */
    private String name;

    /**
     * 包含内容
     */
    private List<Entry> directory = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public Entry add(Entry entry) {
        entry.parent = this;
        directory.add(entry);
        return this;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int size = 0;
        for (Entry entry : directory) {
            size += entry.getSize();
        }
        return size;
    }

    @Override
    public void printList(String prefix) {
        System.out.println(prefix + "/" + this);
        for (Entry entry : directory) {
            entry.printList(prefix + "/" + name);
        }
    }
}
