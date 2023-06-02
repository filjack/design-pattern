package com.design.visitor;


import java.util.Iterator;

/**
 * @author xpf
 * @since 2023/6/2
 */
public abstract class Entry implements Element {
    /**
     * 获得实体名
     *
     * @return 实体名
     */
    public abstract String getName();

    /**
     * 获得实体大小
     *
     * @return 实体大小
     */
    public abstract int getSize();

    /**
     * 新增一个实体
     *
     * @param entry 实体
     * @return
     * @throws FileTreatmentException
     */
    public Entry add(Entry entry) throws FileTreatmentException {
        throw new FileTreatmentException();
    }

    /**
     * 生成迭代器
     *
     * @return 迭代器
     * @throws FileTreatmentException
     */
    public Iterator iterator() throws FileTreatmentException {
        throw new FileTreatmentException();
    }

    @Override
    public String toString() {
        return getName() + "(" + getSize() + ")";
    }
}
