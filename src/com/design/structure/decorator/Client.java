package com.design.structure.decorator;

/**
 * @program: Design Patterns
 * @Date: 2020/9/25 15:41
 * @Author: Mr.Shen
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        Component component = new ConcreteComponent("具体构件");
        Component decoratorA = new ConcreteDecorator(component, "装饰A");
        Component decoratorB = new ConcreteDecorator(decoratorA, "装饰B");
        decoratorB.operation();
    }
}
