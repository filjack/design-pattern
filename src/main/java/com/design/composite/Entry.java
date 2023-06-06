package com.design.composite;

/**
 * 用来实现{@link File}与{@link Directory}的一致性，表示目录条目
 *
 * @author xpf
 * @since 2023/5/25
 */
public abstract class Entry {

    /**
     * 当前目录条目所在目录
     */
    protected Entry parent;

    /**
     * 获取名字
     *
     * @return 名字
     */
    public abstract String getName();

    /**
     * 获取大小
     *
     * @return 大小
     */
    public abstract int getSize();

    /**
     * 向文件夹{@link Directory}中添加目录条目，由子类{@link Directory}实现
     *
     * @param entry 目录条目
     * @return 添加的目录条目
     * @throws FileTreatmentException
     */
    public Entry add(Entry entry) throws FileTreatmentException {
        throw new FileTreatmentException();
    }

    public void printList() {
        printList("");
    }

    /**
     * 显示文件夹内容一览
     *
     * @param prefix 前缀
     */
    public abstract void printList(String prefix);

    public String getFullName() {
        StringBuilder builder = new StringBuilder();
        Entry entry = this;
        do {
            builder.insert(0, "/" + entry.getName());
            entry = entry.parent;
        } while (entry != null);
        return builder.toString();
    }

    @Override
    public String toString() {
        return getName() + "(" + getSize() + ")";
    }
}
