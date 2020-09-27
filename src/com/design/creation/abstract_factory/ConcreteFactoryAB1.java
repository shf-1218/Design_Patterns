package com.design.creation.abstract_factory;

/**
 * @program: Design Patterns
 * @Date: 2020/9/24 22:27
 * @Author: Mr.Shen
 * 具体工厂（Concrete Factory）：主要是实现抽象工厂中的多个抽象方法，完成具体产品的创建
 */
public class ConcreteFactoryAB1 implements AbstractFactory {
    @Override
    public AbstractProductA newProductA() {
        return new ConcreteProductA1();
    }

    @Override
    public AbstractProductB newProductB() {
        return new ConcreteProductB1();
    }
}
