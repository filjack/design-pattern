package com.design.abstractfactory.factory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xpf
 * @since 2023/5/23
 */
public abstract class Tray extends Item {

    protected List<Item> list = new ArrayList<>();

    protected Tray(String caption) {
        super(caption);
    }

    public void add(Item item) {
        list.add(item);
    }

}
