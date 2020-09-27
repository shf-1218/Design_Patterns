package com.design.behavior.visitor;

/**
 * @program: Design Patterns
 * @Date: 2020/9/27 17:52
 * @Author: Mr.Shen
 * 具体访问者（ConcreteVisitor）角色：实现抽象访问者角色中声明的各个访问操作，确定访问者访问一个元素时该做什么。
 */
public class ConcreteVisitorA implements Visitor{
    @Override
    public void visit(ConcreteElementA element) {
        System.out.println("具体访问者A访问-->");
        element.operation();
    }

    @Override
    public void visit(ConcreteElementB element) {
        System.out.println("具体访问者A访问-->");
        element.operation();
    }
}
