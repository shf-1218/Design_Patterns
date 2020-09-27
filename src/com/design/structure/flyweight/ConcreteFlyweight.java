package com.design.structure.flyweight;

/**
 * @program: Design Patterns
 * @Date: 2020/9/25 22:54
 * @Author: Mr.Shen
 */
public class ConcreteFlyweight implements Flyweight {
    private String name;

    public ConcreteFlyweight(String name) {
        this.name = name;
    }

    @Override
    public void operation(UnsharedConcreteFlyweight state) {
        System.out.print("具体享元" + name + "被调用，");
        System.out.println("非享元信息是:" + state.getInfo());
    }
}
