package com.design.chain;

/**
 * @author xpf
 * @since 2023/6/3
 */
public abstract class Support {
    /**
     * 解决问题的实例的名字
     */
    private String name;
    /**
     * 要推卸给的对象
     */
    private Support next;

    public Support(String name) {
        this.name = name;
    }

    public Support setNext(Support next) {
        this.next = next;
        return next;
    }

    public final void support(Trouble trouble) {
        Support current = this;
        while (current != null) {
            if (this.resolve(trouble)) {
                done(trouble);
                break;
            } else if (current.next == null) {
                fail(trouble);
                break;
            }
            current = current.next;
        }
    }

    @Override
    public String toString() {
        return "Support{" +
                "name='" + name + '\'' +
                '}';
    }

    protected abstract boolean resolve(Trouble trouble);

    protected void done(Trouble trouble) {
        System.out.println(trouble + " is resolved by " + this + ".");
    }

    protected void fail(Trouble trouble) {
        System.out.println(trouble + " cannot resolved by " + this + ".");
    }

}
