package com.design.behavior.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: Design Patterns
 * @Date: 2020/9/27 17:52
 * @Author: Mr.Shen
 * 对象结构（Object Structure）角色：是一个包含元素角色的容器，提供让访问者对象遍历容器中的所有元素的方法，通常由 List、Set、Map 等聚合类实现
 */
public class ObjectStructure {
    private List<Element> elementList = new ArrayList<>();

    public void accept(Visitor visitor) {
        elementList.forEach(element -> {
            element.accept(visitor);
        });
    }

    public void add(Element element) {
        elementList.add(element);
    }

    public void remove(Element element) {
        elementList.remove(element);
    }
}
