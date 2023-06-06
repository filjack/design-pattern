package com.design.composite;

/**
 * 文件
 * @author xpf
 * @since 2023/5/25
 */
public class File extends Entry {

    /**
     * 文件名
     */
    private String name;
    /**
     * 文件大小
     */
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void printList(String prefix) {
        System.out.println(prefix + "/" + this);
    }
}
