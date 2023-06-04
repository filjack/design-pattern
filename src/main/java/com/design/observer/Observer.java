package com.design.observer;

/**
 * @author xpf
 * @since 2023/6/4
 */
public interface Observer {
    /**
     * 通知
     *
     * @param generator 数字生成器
     */
    void update(NumberGenerator generator);
}
