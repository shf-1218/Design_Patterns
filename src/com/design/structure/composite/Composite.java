package com.design.structure.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: Design Patterns
 * @Date: 2020/9/25 14:48
 * @Author: Mr.Shen
 * 树枝构件（Composite）角色：是组合中的分支节点对象，它有子节点。它实现了抽象构件角色中声明的接口，它的主要作用是存储和管理子部件，通常包含 Add()、Remove()、GetChild() 等方法。
 */
public class Composite implements Component {
    private String name;
    private List<Component> componentList = new ArrayList<>();

    public Composite(String name) {
        this.name = name;
    }

    public void add(Component component) {
        componentList.add(component);
    }

    public void remove(Component component) {
        componentList.remove(component);
    }

    public Component getChild(int index) {
        return componentList.get(index);
    }

    @Override
    public void operation() {
        System.out.println("树枝"+name+"：被访问！");
        componentList.forEach(component -> {
            component.operation();
        });
    }
}
