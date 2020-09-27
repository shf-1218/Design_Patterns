package com.design.behavior.iterator;

/**
 * @program: Design Patterns
 * @Date: 2020/9/27 11:53
 * @Author: Mr.Shen
 */
public class Client {
    public static void main(String[] args) {
        ConcreteAggregate concreteAggregate = new ConcreteAggregate();
        concreteAggregate.add("中山大学");
        concreteAggregate.add("华南理工");
        concreteAggregate.add("韶关学院");
        Iterator iterator = concreteAggregate.getIterator();
        while (iterator.hasNext()) {
            Object ob = iterator.next();
            System.out.print(ob.toString() + "\t");
        }
        Object ob = iterator.first();
        System.out.println("\nFirst：" + ob.toString());

    }
}
