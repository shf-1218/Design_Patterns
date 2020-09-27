package com.design.behavior.responsibility;

/**
 * @program: Design Patterns
 * @Date: 2020/9/27 14:39
 * @Author: Mr.Shen
 * 抽象处理者（Handler）角色：定义一个处理请求的接口，包含抽象处理方法和一个后继连接。
 */
public abstract class Handler {
    protected Handler handler;

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    abstract void handlerRequest(String request);

}
