package com.design.chain;

/**
 * @author xpf
 * @since 2023/6/3
 */
public class NoSupport extends Support {
    public NoSupport(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return false;
    }
}
