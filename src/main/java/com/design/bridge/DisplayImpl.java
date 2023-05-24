package com.design.bridge;

/**
 * @author xpf
 * @since 2023/5/24
 */
public abstract class DisplayImpl {
    /**
     * 打印前的预处理
     */
    public abstract void rowOpen();

    /**
     * 打印
     */
    public abstract void rowPrint();

    /**
     * 打印后的收尾处理
     */
    public abstract void rowClose();
}
