package com.design.structure.bridge;

/**
 * @program: Design Patterns
 * @Date: 2020/9/25 14:33
 * @Author: Mr.Shen
 * 抽象化（Abstraction）角色：定义抽象类，并包含一个对实现化对象的引用。
 */
public abstract class Abstraction {
    protected Implementor implementor;

    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    public abstract void operationImpl();
}
