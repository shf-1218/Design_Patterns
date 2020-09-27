package com.design.behavior.command;

/**
 * @program: Design Patterns
 * @Date: 2020/9/27 15:37
 * @Author: Mr.Shen
 * 具体命令角色（Concrete    Command）角色：是抽象命令类的具体实现类，它拥有接收者对象，并通过调用接收者的功能来完成命令要执行的操作
 */
public class ConcreteCommandOpen extends Command {
    @Override
    public void execute() {
        this.receiver.open();
    }

    @Override
    public void revoke() {
        this.receiver.close();
    }
}
