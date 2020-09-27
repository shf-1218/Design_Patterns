package com.design.behavior.mediator;

/**
 * @program: Design Patterns
 * @Date: 2020/9/27 16:27
 * @Author: Mr.Shen
 * 抽象中介者（Mediator）角色：它是中介者的接口，提供了同事对象注册与转发同事对象信息的抽象方法
 */
public abstract class Mediator {
    public abstract void register(Colleague colleague);

    public abstract void relay(Colleague colleague);
}
