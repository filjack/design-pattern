package com.design.facade.pagemaker;

/**
 * @author xpf
 * @since 2023/6/3
 */
public class Main {
    public static void main(String[] args) {
        PageMaker.makeWelcomePage("hyuki@hyuki.com", "welcome.html");
        PageMaker.makeLinkPage("linkPage.html");
    }
}
