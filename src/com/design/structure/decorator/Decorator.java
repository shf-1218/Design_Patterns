package com.design.structure.decorator;

/**
 * @program: Design Patterns
 * @Date: 2020/9/25 15:39
 * @Author: Mr.Shen
 * @Description:
 */
public abstract class Decorator implements Component {
    protected Component component;
    protected String name;

    public Decorator(Component component, String name) {
        this.component = component;
        this.name = name;
    }

    @Override
    public  void operation(){
        this.component.operation();
    }
}
