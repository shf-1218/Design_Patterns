package com.design.structure.bridge;

/**
 * @program: Design Patterns
 * @Date: 2020/9/25 14:36
 * @Author: Mr.Shen
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        Implementor implementor = new ConcreteImplementorA();
        Abstraction abstraction = new RefinedAbstractionA(implementor);
        abstraction.operationImpl();
    }
}
