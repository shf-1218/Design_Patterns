package com.design.creation.factory;

/**
 * @program: Design Patterns
 * @Date: 2020/9/24 22:01
 * @Author: Mr.Shen
 * 抽象工厂（Abstract Factory）：提供了创建产品的接口，调用者通过它访问具体工厂的工厂方法 newProduct() 来创建产品
 */
public interface AbstractFactory {
    Product newProduct();
}
