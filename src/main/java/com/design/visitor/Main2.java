package com.design.visitor;

/**
 * @author xpf
 * @since 2023/6/2
 */
public class Main2 {
    public static void main(String[] args) {
        try {
            Directory root1 = new Directory("root1");
            root1.add(new File("diary.html", 100));
            root1.add(new File("index.html", 200));

            Directory root2 = new Directory("root2");
            root2.add(new File("diary.html", 1000));
            root2.add(new File("index.html", 2000));

            ElementArrayList list = new ElementArrayList();
            list.add(root1);
            list.add(root2);
            list.add(new File("etc.html", 1234));

            list.accept(new ListVisitor());
        } catch (FileTreatmentException e) {
            e.printStackTrace();
        }
    }
}
