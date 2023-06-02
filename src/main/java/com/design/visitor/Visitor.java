package com.design.visitor;

/**
 * @author xpf
 * @since 2023/6/2
 */
public abstract class Visitor {
    /**
     * 访问文件
     *
     * @param file 文件
     */
    public abstract void visit(File file);

    /**
     * 访问文件夹
     *
     * @param directory 文件夹
     */
    public abstract void visit(Directory directory);
}
