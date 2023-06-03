package com.design.chain;

/**
 * @author xpf
 * @since 2023/6/3
 */
public class OddSupport extends Support {
    public OddSupport(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return trouble.getNumber() % 2 != 0;
    }
}
