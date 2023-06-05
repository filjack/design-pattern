package com.design.memento.gamer;

import java.util.ArrayList;
import java.util.List;

/**
 * 表示Gamer状态
 *
 * @author xpf
 * @since 2023/6/5
 */
public class Memento {
    /**
     * 金钱
     */
    int money;
    /**
     * 水果
     */
    List<String> fruits;

    Memento(int money) {
        this.money = money;
        this.fruits = new ArrayList<>();
    }

    public int getMoney() {
        return money;
    }

    public void addFruit(String fruit) {
        this.fruits.add(fruit);
    }

    public List<String> getFruits() {
        return fruits;
    }
}
