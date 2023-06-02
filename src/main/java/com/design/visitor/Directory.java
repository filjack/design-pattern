package com.design.visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author xpf
 * @since 2023/6/2
 */
public class Directory extends Entry {

    private String name;
    private List<Entry> dir = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int size = 0;
        Iterator<Entry> iterator = dir.iterator();
        while (iterator.hasNext()) {
            Entry entry = iterator.next();
            size+= entry.getSize();
        }
        return size;
    }

    @Override
    public Entry add(Entry entry) throws FileTreatmentException {
        dir.add(entry);
        return entry;
    }

    @Override
    public Iterator iterator() throws FileTreatmentException {
        return dir.iterator();
    }
}
