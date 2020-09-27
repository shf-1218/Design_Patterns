package com.design.behavior.state;

/**
 * @program: Design Patterns
 * @Date: 2020/9/27 16:15
 * @Author: Mr.Shen
 *
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.setState(new ConcreteStateA());
        context.Handle();
        context.Handle();
    }
}
