package com.design.structure.flyweight;

import java.util.HashMap;

/**
 * @program: Design Patterns
 * @Date: 2020/9/25 22:55
 * @Author: Mr.Shen
 */
public class FlyweightFactory {
    private HashMap<String, Flyweight> flyweightHashMap = new HashMap<>();

    public Flyweight getFlyweight(String name) {
        Flyweight flyweight = null;
        if (flyweightHashMap.containsKey(name)) {
            flyweight = flyweightHashMap.get(name);
        } else {
            flyweight = new ConcreteFlyweight(name);
            flyweightHashMap.put(name, flyweight);
        }
        return flyweight;
    }
}
