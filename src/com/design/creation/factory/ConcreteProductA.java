package com.design.creation.factory;


/**
 * @program: Design Patterns
 * @Date: 2020/9/24 18:18
 * @Author: Mr.Shen
 * 具体产品（ConcreteProduct）：是简单工厂模式的创建目标
 */
public class ConcreteProductA implements Product {
    @Override
    public void show() {
        System.out.println("----A产品----");
    }
}
