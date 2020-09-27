package com.design.creation.abstract_factory;

/**
 * @program: Design Patterns
 * @Date: 2020/9/24 22:01
 * @Author: Mr.Shen
 * 抽象工厂（Abstract Factory）：提供了创建产品的接口，它包含多个创建产品的方法 newProduct()，可以创建多个不同等级的产品
 */
public interface AbstractFactory {

    AbstractProductA newProductA();

    AbstractProductB newProductB();
}
