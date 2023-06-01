package com.design.decorator;

/**
 * @author xpf
 * @since 2023/5/31
 */
public class App {
    public static void main(String[] args) {

        Display b1 = new StringDisplay("Hello World.");
        Display b2 = new SideBorder(b1, '#');
        Display b3 = new FullBorder(b2);

        b1.show();
        b2.show();
        b3.show();

        Display b4 =
                new SideBorder(
                        new FullBorder(
                                new SideBorder(
                                        new FullBorder(
                                                new StringDisplay("你好，世界。")
                                        ), '#'
                                )
                        ), '/'
                );
        b4.show();


        Display b5 = new StringDisplay("Director Pattern.");
        Display b6 = new UpDownBorder(b5, '-');
        Display b7 = new SideBorder(b6, '*');

        b5.show();
        b6.show();
        b7.show();

        Display b8 =
                new FullBorder(
                        new UpDownBorder(
                                new SideBorder(
                                        new UpDownBorder(
                                                new SideBorder(
                                                        new StringDisplay("Director Pattern."), '*'
                                                ), '='
                                        ), '|'
                                ), '/'
                        )
                );
        b8.show();

        MultiStringDisplay md = new MultiStringDisplay();
        md.add("Good Morning.");
        md.add("Good Afternoon");
        md.add("Good Evening");
        md.show();

        Display d9 = new SideBorder(md, '#');
        d9.show();
        Display d10 = new FullBorder(md);
        d10.show();
    }
}
