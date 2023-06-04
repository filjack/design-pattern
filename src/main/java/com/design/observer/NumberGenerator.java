package com.design.observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author xpf
 * @since 2023/6/4
 */
public abstract class NumberGenerator {

    /**
     * 持有的观察者列表
     */
    private List<Observer> observerList = new ArrayList<>();

    /**
     * 新增
     *
     * @param observer 观察者
     */
    public void addObserver(Observer observer) {
        this.observerList.add(observer);
    }

    /**
     * 删除
     *
     * @param observer 观察者
     */
    public void deleteObserver(Observer observer) {
        this.observerList.remove(observer);
    }

    /**
     * 通知所有的观察者
     */
    public void notifyObservers() {
        Iterator<Observer> iterator = observerList.listIterator();
        while (iterator.hasNext()) {
            Observer observer = iterator.next();
            observer.update(this);
        }
    }

    /**
     * 获取一个数字
     *
     * @return 数字
     */
    public abstract int getNumber();

    /**
     * 生成一个数字
     */
    public abstract void execute();
}
