package com.design.creation.factory;

/**
 * @program: Design Patterns
 * @Date: 2020/9/24 22:02
 * @Author: Mr.Shen
 * 具体工厂（ConcreteFactory）：主要是实现抽象工厂中的抽象方法，完成具体产品的创建
 */
public class ConcreteFactoryB implements AbstractFactory {
    @Override
    public Product newProduct() {
        return  new ConcreteProductB();
    }
}
