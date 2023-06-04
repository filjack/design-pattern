package com.design.mediator;

/**
 * @author xpf
 * @since 2023/6/4
 */
public interface Mediator {
    /**
     * 生成组员
     */
    void createColleagues();

    /**
     * 接收组员的变化信息
     */
    void colleagueChanged();
}
