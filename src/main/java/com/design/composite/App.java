package com.design.composite;

/**
 * @author xpf
 * @since 2023/5/25
 */
public class App {
    public static void main(String[] args) {

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
        rootDir.printList();


        System.out.println("");
        System.out.println("Making user entries...");
        Directory yukiDir = new Directory("yuki");
        Directory hanakoDir = new Directory("hanako");
        Directory tomuraDir = new Directory("tomura");

        usrDir.add(yukiDir);
        usrDir.add(hanakoDir);
        usrDir.add(tomuraDir);

        yukiDir.add(new File("diary.html", 100));
        yukiDir.add(new File("Composite.java", 200));

        hanakoDir.add(new File("memo.tex", 200));

        tomuraDir.add(new File("game.doc", 400));
        tomuraDir.add(new File("iunk.mail", 500));
        rootDir.printList();

    }
}
