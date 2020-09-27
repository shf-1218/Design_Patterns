package com.design.behavior.strategy;

/**
 * @program: Design Patterns
 * @Date: 2020/9/27 11:30
 * @Author: Mr.Shen
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context(new ConcreteStrategyA());
        context.strategy();
    }
}
