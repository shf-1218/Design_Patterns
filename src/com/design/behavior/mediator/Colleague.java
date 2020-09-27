package com.design.behavior.mediator;

/**
 * @program: Design Patterns
 * @Date: 2020/9/27 16:27
 * @Author: Mr.Shen
 * 抽象同事类（Colleague）角色：定义同事类的接口，保存中介者对象，提供同事对象交互的抽象方法，实现所有相互影响的同事类的公共功能
 */
public abstract class Colleague {
    protected Mediator mediator;

    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void send();

    public abstract void receive();
}
