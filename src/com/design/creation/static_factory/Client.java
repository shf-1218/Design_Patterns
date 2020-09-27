package com.design.creation.static_factory;

/**
 * @program: Design Patterns
 * @Date: 2020/9/24 18:21
 * @Author: Mr.Shen
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        SimpleFactory.makeProduct("A").show();
    }
}
