package com.design.behavior.command;

/**
 * @program: Design Patterns
 * @Date: 2020/9/27 15:34
 * @Author: Mr.Shen
 * 实现者/接收者（Receiver）角色：执行命令功能的相关操作，是具体命令对象业务的真正实现者。
 */
public class Receiver {
    public void open() {
        System.out.println("接收者的open()方法被调用...");
    }

    public void close() {
        System.out.println("接收者的close()方法被调用...");
    }
}
