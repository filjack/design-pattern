package com.design.proxy;

/**
 * @author xpf
 * @since 2023/6/10
 */
public class Printer implements Printable {

    private String name;

    public Printer() {
        heavyJob("正在生成Printer的实例");
    }

    public Printer(String name) {
        this.name = name;
        heavyJob("正在生成Printer的实例{" + name + "}");
    }

    @Override
    public void setPrinterName(String name) {
        this.name = name;
    }

    @Override
    public String getPrintName() {
        return name;
    }

    @Override
    public void print(String context) {
        System.out.println("===" + name + "===");
        System.out.println(context);
    }

    private void heavyJob(String msg) {
        System.out.print(msg);
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ignored) {
            }
            System.out.print(".");
        }
        System.out.println();
        System.out.println("结束。");
    }
}
