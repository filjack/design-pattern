package com.design.memento;

import com.design.memento.gamer.Gamer;
import com.design.memento.gamer.Memento;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

/**
 * @author xpf
 * @since 2023/6/5
 */
public class Main {
    public static final String SAVE_FILE_NAME = "src/main/resources/gamer.dat";
    public static void main(String[] args) {
        Gamer gamer = new Gamer(100);
        Memento memento = loadMemento();
        if (memento != null) {
            System.out.println("读取上次保存存档开始游戏");
            gamer.restoreMemento(memento);
        } else {
            System.out.println("新游戏");
            memento = gamer.createMemento();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("====" + i);
            System.out.println("当前状态：" + gamer);

            gamer.bet();
            System.out.println("所持金钱为" + gamer.getMoney() + "元");
            if (gamer.getMoney() > memento.getMoney()) {
                System.out.println("（所持金钱增多了，因此保存游戏当前状态）");
                memento = gamer.createMemento();
                saveMemento(memento);
            } else if (gamer.getMoney() < memento.getMoney() / 2) {
                System.out.println("（所持金钱减少了许多，因此恢复游戏至以前的状态）");
                gamer.restoreMemento(memento);
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println();
        }
    }

    public static void saveMemento(Memento memento) {
        try (ObjectOutput output = new ObjectOutputStream(new FileOutputStream(SAVE_FILE_NAME))) {
            output.writeObject(memento);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Memento loadMemento() {
        Memento memento = null;
        try (ObjectInput input = new ObjectInputStream(new FileInputStream(SAVE_FILE_NAME))) {
            memento = (Memento) input.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return memento;
    }

}
