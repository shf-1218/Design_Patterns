package com.design.creation.abstract_factory;

/**
 * @program: Design Patterns
 * @Date: 2020/9/24 22:23
 * @Author: Mr.Shen
 * 具体产品（ConcreteProduct）：实现了抽象产品角色所定义的接口，由具体工厂来创建，它同具体工厂之间是多对一的关系
 */
public class ConcreteProductB1 implements AbstractProductB {
    @Override
    public void show() {
        System.out.println("----B1产品----");
    }
}
