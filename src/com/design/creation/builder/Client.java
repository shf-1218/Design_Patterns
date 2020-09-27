package com.design.creation.builder;

/**
 * @program: Design Patterns
 * @Date: 2020/9/25 11:20
 * @Author: Mr.Shen
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        Product product = director.construct();
        product.show();
        System.out.println(product.toString());
    }
}
