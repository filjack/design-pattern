package com.design.proxy;

/**
 * @author xpf
 * @since 2023/6/10
 */
public class PrintProxy implements Printable {

    private String name;
    private Printable real;
    private String className;

    public PrintProxy() {
    }

    public PrintProxy(String name, String className) {
        this.name = name;
        this.className = className;
    }

    @Override
    public synchronized void setPrinterName(String name) {
        if (real != null) {
            real.setPrinterName(name);
        }
        this.name = name;
    }

    @Override
    public String getPrintName() {
        return name;
    }

    @Override
    public void print(String context) {
        realize();
        real.print(context);
    }

    private synchronized void realize() {
        if (real == null) {
            try {
                real = (Printable) Class.forName(className).newInstance();
                real.setPrinterName(name);
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }
}
