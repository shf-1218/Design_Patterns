package com.design.creation.factory;

/**
 * @program: Design Patterns
 * @Date: 2020/9/24 22:03
 * @Author: Mr.Shen
 */
public class Client {
    public static void main(String[] args) {
        new ConcreteFactoryB().newProduct().show();
    }
}
