package com.design.behavior.command;

/**
 * @program: Design Patterns
 * @Date: 2020/9/27 15:34
 * @Author: Mr.Shen
 * 抽象命令类（Command）角色：声明执行命令的接口，拥有执行命令的抽象方法 execute()
 */
public abstract class Command {
    protected Receiver receiver;

    public Command() {
        this.receiver = new Receiver();
    }

    public abstract void execute();

    public abstract void revoke();
}
