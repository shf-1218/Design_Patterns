package com.design.behavior.command;

/**
 * @program: Design Patterns
 * @Date: 2020/9/27 15:40
 * @Author: Mr.Shen
 */
public class Client {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        invoker.setCommand(new ConcreteCommandOpen());
        invoker.action();
    }
}
