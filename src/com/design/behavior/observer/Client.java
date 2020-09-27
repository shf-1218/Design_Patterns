package com.design.behavior.observer;

/**
 * @program: Design Patterns
 * @Date: 2020/9/27 11:41
 * @Author: Mr.Shen
 */
public class Client {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        subject.add(new ConcreteObserverA());
        subject.add(new ConcreteObserverB());
        subject.notifyObserver();
    }
}
