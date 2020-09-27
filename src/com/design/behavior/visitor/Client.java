package com.design.behavior.visitor;

/**
 * @program: Design Patterns
 * @Date: 2020/9/27 17:56
 * @Author: Mr.Shen
 */
public class Client {
    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.add(new ConcreteElementA());
        objectStructure.add(new ConcreteElementB());
        objectStructure.accept(new ConcreteVisitorA());
    }

}
