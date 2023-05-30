package com.design.composite;

/**
 * @author xpf
 * @since 2023/5/25
 */
public abstract class Entry {

    protected Entry parent;

    public abstract String getName();

    public abstract int getSize();

    public Entry add(Entry entry) throws FileTreatmentException {
        throw new FileTreatmentException();
    }

    public void printList() {
        printList("");
    }

    public abstract void printList(String prefix);

    public String getFullName() {
        StringBuilder builder = new StringBuilder();
        Entry entry = this;
        do {
            builder.insert(0, "/" + entry.getName());
            entry = entry.parent;
        } while (entry != null);
        return builder.toString();
    }

    @Override
    public String toString() {
        return getName() + "(" + getSize() + ")";
    }
}
