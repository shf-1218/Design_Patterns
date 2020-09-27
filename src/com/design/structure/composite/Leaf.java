package com.design.structure.composite;

/**
 * @program: Design Patterns
 * @Date: 2020/9/25 14:50
 * @Author: Mr.Shen
 * 树叶构件（Leaf）角色：是组合中的叶节点对象，它没有子节点，用于实现抽象构件角色中 声明的公共接口
 */
public class Leaf implements Component {
    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void operation() {
        System.out.println("树叶"+name+"：被访问！");
    }

}
