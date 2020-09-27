package com.design.behavior.visitor;

/**
 * @program: Design Patterns
 * @Date: 2020/9/27 17:51
 * @Author: Mr.Shen
 * 具体元素（ConcreteElement）角色：实现抽象元素角色提供的 accept() 操作，其方法体通常都是 visitor.visit(this) ，另外具体元素中可能还包含本身业务逻辑的相关操作。
 */
public class ConcreteElementB implements Element{
    @Override
    public void accept(Visitor Visitor) {
        Visitor.visit(this);
    }

    @Override
    public void operation() {
        System.out.println("具体元素B的操作。");
    }
}
