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

        File diaryFile = new File("diary.html", 100);
        File compositeFile = new File("Composite.java", 200);

        yukiDir.add(diaryFile);
        yukiDir.add(compositeFile);

        File memoFile = new File("memo.tex", 200);

        hanakoDir.add(memoFile);

        File gameFile = new File("game.doc", 400);
        File iunkFile = new File("iunk.mail", 500);

        tomuraDir.add(gameFile);
        tomuraDir.add(iunkFile);
        rootDir.printList();

        System.out.println("");
        System.out.println("game path : " + gameFile.getFullName());
        System.out.println("iunk path : " + iunkFile.getFullName());

    }
}
