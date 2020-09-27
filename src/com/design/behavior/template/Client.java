package com.design.behavior.template;

/**
 * @program: Design Patterns
 * @Date: 2020/9/26 11:31
 * @Author: Mr.Shen
 */
public class Client {
    public static void main(String[] args) {
        AbstractClass abstractClass=new ConcreteClass();
        abstractClass.templateMethod();
    }
}
