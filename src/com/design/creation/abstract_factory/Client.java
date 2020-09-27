package com.design.creation.abstract_factory;

/**
 * @program: Design Patterns
 * @Date: 2020/9/24 22:29
 * @Author: Mr.Shen
 */
public class Client {
    public static void main(String[] args) {
        new ConcreteFactoryAB1().newProductA().show();
    }
}
