package com.design.structure.composite;

/**
 * @program: Design Patterns
 * @Date: 2020/9/25 14:55
 * @Author: Mr.Shen
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        Composite composite=new Composite("树枝");
        Composite compositeA = new Composite("树枝A");
        compositeA.add(new Leaf("A1"));
        compositeA.add(new Leaf("A2"));
        composite.add(compositeA);
        Composite compositeB = new Composite("树枝B");
        compositeB.add(new Leaf("B1"));
        compositeB.add(new Leaf("B2"));
        composite.add(compositeB);
        composite.operation();
    }
}
