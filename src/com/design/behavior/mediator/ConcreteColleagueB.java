package com.design.behavior.mediator;

/**
 * @program: Design Patterns
 * @Date: 2020/9/27 16:32
 * @Author: Mr.Shen
 * 具体同事类（Concrete Colleague）角色：是抽象同事类的实现者，当需要与其他同事对象交互时，由中介者对象负责后续的交互。
 */
public class ConcreteColleagueB extends Colleague {
    @Override
    public void send() {
        System.out.println("具体同事类B发出请求。");
        mediator.relay(this); //请中介者转发
    }

    @Override
    public void receive() {
        System.out.println("具体同事类B收到请求。");
    }
}
