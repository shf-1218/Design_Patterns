package com.design.behavior.mediator;

/**
 * @program: Design Patterns
 * @Date: 2020/9/27 16:33
 * @Author: Mr.Shen
 */
public class Client {
    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();
        ConcreteColleagueA colleagueA = new ConcreteColleagueA();
        colleagueA.setMediator(mediator);
        ConcreteColleagueB colleagueB = new ConcreteColleagueB();
        colleagueB.setMediator(mediator);
        mediator.register(colleagueA);
        mediator.register(colleagueB);
        colleagueB.send();
    }
}
