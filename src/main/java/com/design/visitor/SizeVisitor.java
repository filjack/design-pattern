package com.design.visitor;

import java.util.Iterator;

/**
 * @author xpf
 * @since 2023/6/2
 */
public class SizeVisitor extends Visitor {

    private int size;

    public SizeVisitor() {
        this.size = 0;
    }

    @Override
    public void visit(File file) {
        this.size += file.getSize();
    }

    @Override
    public void visit(Directory directory) {
        Iterator<Entry> iterator = directory.iterator();
        while (iterator.hasNext()) {
            Entry entry = iterator.next();
            entry.accept(this);
        }
    }

    public int getSize() {
        return size;
    }
}
