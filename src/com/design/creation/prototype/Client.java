package com.design.creation.prototype;

/**
 * @program: Design Patterns
 * @Date: 2020/9/24 22:42
 * @Author: Mr.Shen
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Realizetype obj1=new Realizetype();
        Realizetype obj2=(Realizetype)obj1.clone();
        System.out.println("obj1==obj2?"+(obj1==obj2));
    }
}
