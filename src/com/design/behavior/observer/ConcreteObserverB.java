package com.design.behavior.observer;

/**
 * @program: Design Patterns
 * @Date: 2020/9/27 11:38
 * @Author: Mr.Shen
 * 具体观察者（Concrete Observer）角色：实现抽象观察者中定义的抽象方法，以便在得到目标的更改通知时更新自身的状态。
 */
public class ConcreteObserverB implements Observer {
    @Override
    public void response() {
        System.out.println("具体观察者B作出反应！");
    }
}
