package com.design.visitor;

/**
 * @author xpf
 * @since 2023/6/2
 */
public interface Element {
    /**
     * 接收一个访问者
     *
     * @param visitor 访问者
     */
    void accept(Visitor visitor);
}
