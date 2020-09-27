package com.design.structure.facade;

/**
 * @program: Design Patterns
 * @Date: 2020/9/25 16:08
 * @Author: Mr.Shen
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.operation();
    }
}
