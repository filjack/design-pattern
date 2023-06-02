package com.design.visitor;

import java.util.Iterator;

/**
 * @author xpf
 * @since 2023/6/2
 */
public class ListVisitor extends Visitor {

    private String currentDir = "";

    @Override
    public void visit(File file) {
        System.out.println(currentDir + "/" + file.getName());
    }

    @Override
    public void visit(Directory directory) {
        System.out.println(currentDir + "/" + directory.getName());
        String saveDir = currentDir;
        currentDir = currentDir + "/" + directory.getName();
        Iterator iterator = directory.iterator();
        while (iterator.hasNext()) {
            Entry entry = (Entry) iterator.next();
            entry.accept(this);
        }
        currentDir = saveDir;
//        System.out.println("saveDir: " + saveDir);
    }
}
