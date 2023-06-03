package com.design.facade.pagemaker;

import com.design.visitor.Entry;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

/**
 * @author xpf
 * @since 2023/6/3
 */
public class PageMaker {
    private PageMaker() {

    }

    public static void makeWelcomePage(String mailAddress, String fileName) {
        try {
            Properties mailProp = Database.getProperties("mailData");
            String userName = mailProp.getProperty(mailAddress);
            HtmlWriter writer = new HtmlWriter(new FileWriter(fileName));
            writer.title("Welcome to " + userName + "'s page!");
            writer.paragraph("欢迎来到" + userName + "的主页！");
            writer.paragraph("等着你的邮件哦！");
            writer.mailTo(mailAddress, userName);
            writer.close();
            System.out.println(fileName + " is created for " + mailAddress + "(" + userName + ")");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void makeLinkPage(String fileName) {
        try {
            Properties mailProp = Database.getProperties("mailData");
            HtmlWriter writer = new HtmlWriter(new FileWriter(fileName));
            writer.title("Link page");
            mailProp.forEach((key, value) -> {
                try {
                    writer.mailTo(key.toString(), value.toString());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            writer.close();
            System.out.println(fileName + " is created.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
