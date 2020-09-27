package com.design.creation.factory;


/**
 * @program: Design Patterns
 * @Date: 2020/9/24 18:19
 * @Author: Mr.Shen
 * 具体产品（ConcreteProduct）：是简单工厂模式的创建目标
 */
public class ConcreteProductB implements Product {
    @Override
    public void show() {
        System.out.println("----B产品----");
    }
}
