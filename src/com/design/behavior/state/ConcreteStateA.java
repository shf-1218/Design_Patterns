package com.design.behavior.state;

/**
 * @program: Design Patterns
 * @Date: 2020/9/27 16:13
 * @Author: Mr.Shen
 * 具体状态（Concrete    State）角色：实现抽象状态所对应的行为。
 */
public class ConcreteStateA implements State {
    @Override
    public void Handle(Context context) {
        System.out.println("当前状态是 A.");
        context.setState(new ConcreteStateB());
    }
}
