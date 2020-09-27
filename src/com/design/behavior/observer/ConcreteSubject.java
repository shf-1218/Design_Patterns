package com.design.behavior.observer;

/**
 * @program: Design Patterns
 * @Date: 2020/9/27 11:41
 * @Author: Mr.Shen
 * 具体主题（Concrete    Subject）角色：也叫具体目标类，它实现抽象目标中的通知方法，当具体主题的内部状态发生改变时，通知所有注册过的观察者对象
 */
public class ConcreteSubject extends Subject{
    @Override
    public void notifyObserver() {
        observerList.forEach(observer -> {
            observer.response();
        });
    }
}
