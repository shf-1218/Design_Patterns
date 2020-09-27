package com.design.behavior.state;

/**
 * @program: Design Patterns
 * @Date: 2020/9/27 16:13
 * @Author: Mr.Shen
 * 环境（Context）角色：也称为上下文，它定义了客户感兴趣的接口，维护一个当前状态，并将与状态相关的操作委托给当前状态对象来处理。
 */
public class Context {
    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    //对请求做处理
    public void Handle() {
        state.Handle(this);
    }
}
