package com.design.bridge;

/**
 * @author xpf
 * @since 2023/5/24
 */
public class App {

    public static void main(String[] args) {
        Display d1 = new Display(new StringDisplayImpl("Hello, China."));
        Display d2 = new CountDisplay(new StringDisplayImpl("Hello, World."));
        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello, Universe."));

        RandomDisplay d4 = new RandomDisplay(new StringDisplayImpl("Hello, Random."));

        Display d5 = new Display(new TextDisplayImpl("src/main/resources/start.txt"));

        IncreaseDisplay d6 = new IncreaseDisplay(new CharDisplayImpl('|', '*', '>'));

        d1.display();
        d2.display();
        d3.display();

        d3.multiDisplay(5);

        d4.randomDisplay(5);

        d5.display();

        d6.increaseDisplay(7);
    }

}
