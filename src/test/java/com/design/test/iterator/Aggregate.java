package com.design.test.iterator;

/**
 * @author xpf
 * @since 2023/5/18
 */
public interface Aggregate<T> {
    Iterator<T> iterator();
}
