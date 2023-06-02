package com.design.visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author xpf
 * @since 2023/6/2
 */
public class FileFindVisitor extends Visitor {

    private String suffix;
    private List<Entry> files = new ArrayList<>();


    public FileFindVisitor(String suffix) {
        this.suffix = suffix;
    }

    @Override
    public void visit(File file) {
        if (file.getName().endsWith(suffix)) {
            files.add(file);
        }
    }

    @Override
    public void visit(Directory directory) {
        Iterator iterator = directory.iterator();
        while (iterator.hasNext()) {
            Entry entry = (Entry) iterator.next();
            entry.accept(this);
        }
    }

    public Iterator getFoundFiles() {
        return files.iterator();
    }

}
