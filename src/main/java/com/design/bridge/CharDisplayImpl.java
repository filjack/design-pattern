package com.design.bridge;

/**
 * @author xpf
 * @since 2023/5/24
 */
public class CharDisplayImpl extends DisplayImpl {

    private char head;
    private char body;
    private char foot;

    public CharDisplayImpl(char head, char body, char foot) {
        this.head = head;
        this.body = body;
        this.foot = foot;
    }

    @Override
    public void rowOpen() {
        System.out.print(head);
    }

    @Override
    public void rowPrint() {
        System.out.print(body);
    }

    @Override
    public void rowClose() {
        System.out.print(foot);
    }
}
