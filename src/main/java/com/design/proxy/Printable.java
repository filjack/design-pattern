package com.design.proxy;

/**
 * @author xpf
 * @since 2023/6/10
 */
public interface Printable {
    /**
     * 设置打印机名称
     *
     * @param name 名称
     */
    void setPrinterName(String name);

    /**
     * 获取打印机名称
     *
     * @return 打印机名称
     */
    String getPrintName();

    /**
     * 打印内容
     *
     * @param context 内容
     */
    void print(String context);
}
