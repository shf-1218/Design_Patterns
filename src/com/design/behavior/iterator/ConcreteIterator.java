package com.design.behavior.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: Design Patterns
 * @Date: 2020/9/27 11:48
 * @Author: Mr.Shen
 * 具体迭代器（Concretelterator）角色：实现抽象迭代器接口中所定义的方法，完成对聚合对象的遍历，记录遍历的当前位置
 */
public class ConcreteIterator implements Iterator {
    private List<Object> objectList = new ArrayList<>();
    private int index = -1;

    public ConcreteIterator(List<Object> list) {
        objectList = list;
    }

    @Override
    public Object first() {
        index = 0;
        Object obj = objectList.get(index);
        return obj;
    }

    @Override
    public Object next() {
        Object obj = null;
        if (this.hasNext()) {
            obj = objectList.get(++index);
        }
        return obj;
    }

    @Override
    public boolean hasNext() {
        if (index < objectList.size() - 1) {
            return true;
        } else {
            return false;
        }
    }
}
