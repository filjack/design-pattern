package com.design.visitor;

import java.util.Iterator;

/**
 * @author xpf
 * @since 2023/6/2
 */
public class Main {

    public static void main(String[] args) {
        try {
            System.out.println("Making root entries...");
            Directory rootDir = new Directory("root");
            Directory binDir = new Directory("bin");
            Directory tmpDir = new Directory("tmp");
            Directory usrDir = new Directory("usr");
            rootDir.add(binDir);
            rootDir.add(tmpDir);
            rootDir.add(usrDir);
            binDir.add(new File("vi", 10000));
            binDir.add(new File("latex", 20000));
            rootDir.accept(new ListVisitor());


            System.out.println("");
            System.out.println("Making usr entries...");
            Directory yuki = new Directory("yuki");
            Directory hanako = new Directory("hanako");
            Directory tomura = new Directory("tomura");
            usrDir.add(yuki);
            usrDir.add(hanako);
            usrDir.add(tomura);
            yuki.add(new File("diary.html", 100));
            yuki.add(new File("Composite.java", 200));
            hanako.add(new File("memo.tex", 300));
            hanako.add(new File("index.html", 300));
            tomura.add(new File("game.doc", 400));
            tomura.add(new File("junk.mail", 500));
            rootDir.accept(new ListVisitor());

            System.out.println("");
            System.out.println("find special files...");
            FileFindVisitor visitor = new FileFindVisitor(".html");
            rootDir.accept(visitor);
            Iterator iterator = visitor.getFoundFiles();
            while (iterator.hasNext()) {
                Entry entry = (Entry) iterator.next();
                System.out.println(entry.toString());
            }

            System.out.println("");
            System.out.println("get size...");
            SizeVisitor sizeVisitor = new SizeVisitor();
            rootDir.accept(sizeVisitor);
            System.out.println("visitor result: " + sizeVisitor.getSize());
            System.out.println("getSize method result: " + rootDir.getSize());
        } catch (FileTreatmentException e) {
            e.printStackTrace();
        }
    }

}
