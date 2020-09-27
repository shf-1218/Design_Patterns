package com.design.behavior.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: Design Patterns
 * @Date: 2020/9/27 11:39
 * @Author: Mr.Shen
 * 抽象主题（Subject）角色：也叫抽象目标类，它提供了一个用于保存观察者对象的聚集类和增加、删除观察者对象的方法，以及通知所有观察者的抽象方法。
 */
public abstract class Subject {
    protected List<Observer> observerList = new ArrayList<>();

    public void add(Observer observer) {
        observerList.add(observer);
    }

    public void remove(Observer observer) {
        observerList.remove(observer);
    }

    public abstract void notifyObserver();
}
