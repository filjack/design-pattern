package com.design.visitor;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author xpf
 * @since 2023/6/2
 */
public class ElementArrayList extends ArrayList<Entry> implements Element {

    @Override
    public void accept(Visitor visitor) {
        Iterator<Entry> iterator = iterator();
        while (iterator.hasNext()) {
            Entry entry = iterator.next();
            entry.accept(visitor);
        }
    }
}
