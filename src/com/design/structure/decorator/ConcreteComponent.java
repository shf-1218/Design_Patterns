package com.design.structure.decorator;

/**
 * @program: Design Patterns
 * @Date: 2020/9/25 15:38
 * @Author: Mr.Shen
 * @Description:
 */
public class ConcreteComponent implements Component {
    private String name;

    public ConcreteComponent(String name) {
        this.name = name;
    }

    @Override
    public void operation() {
        System.out.println("调用具体构件角色的方法operation()");
    }
}
