package com.design.behavior.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: Design Patterns
 * @Date: 2020/9/27 11:49
 * @Author: Mr.Shen
 * 具体聚合（ConcreteAggregate）角色：实现抽象聚合类，返回一个具体迭代器的实例。
 */
public class ConcreteAggregate implements Aggregate {
    private List<Object> list = new ArrayList<>();

    @Override
    public void add(Object obj) {
        list.add(obj);
    }

    @Override
    public void remove(Object obj) {
        list.remove(obj);
    }

    @Override
    public Iterator getIterator() {
        return new ConcreteIterator(list);
    }
}
