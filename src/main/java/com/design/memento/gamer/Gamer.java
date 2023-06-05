package com.design.memento.gamer;

import com.design.memento.gamer.Memento;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * @author xpf
 * @since 2023/6/5
 */
public class Gamer {
    private int money;
    private List<String> fruits = new ArrayList<>();
    private Random random = new Random();
    private static final String[] fruitNames = {"苹果", "葡萄", "香蕉", "橘子"};

    public Gamer(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void bet() {
        int dice = random.nextInt(6) + 1;
        if (dice == 1) {
            money += 100;
            System.out.println("所持金钱增加了");
        } else if (dice == 2) {
            money /= 2;
            System.out.println("所持金钱减半了");
        } else if (dice == 6) {
            String f = getFruit();
            System.out.println("获得了水果(" + f + ")");
            fruits.add(f);
        } else {
            System.out.println("什么都没有发生！");
        }
    }

    public Memento createMemento() {
        Memento memento = new Memento(money);
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            String f = iterator.next();
            if (f.startsWith("好吃的")) {
                memento.addFruit(f);
            }
        }
        return memento;
    }

    public void restoreMemento(Memento memento) {
        this.money = memento.getMoney();
        this.fruits = memento.getFruits();
    }

    private String getFruit() {
        String prefix = "";
        if (random.nextBoolean()) {
            prefix = "好吃的";
        }
        return prefix + fruitNames[random.nextInt(fruitNames.length)];
    }

    @Override
    public String toString() {
        return "Gamer{" +
                "money=" + money +
                ", fruits=" + fruits +
                ", random=" + random +
                '}';
    }
}
