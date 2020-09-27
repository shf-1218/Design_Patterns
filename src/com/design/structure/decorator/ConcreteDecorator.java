package com.design.structure.decorator;

/**
 * @program: Design Patterns
 * @Date: 2020/9/25 15:40
 * @Author: Mr.Shen
 * @Description:
 */
public class ConcreteDecorator extends Decorator {


    public ConcreteDecorator(Component component, String name) {
        super(component, name);
    }

    @Override
    public void operation() {
        System.out.println("为具体构件角色增加额外的功能:"+name);
        super.operation();
    }

}
