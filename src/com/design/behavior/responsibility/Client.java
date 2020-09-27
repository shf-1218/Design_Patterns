package com.design.behavior.responsibility;

/**
 * @program: Design Patterns
 * @Date: 2020/9/27 14:42
 * @Author: Mr.Shen
 * 客户类（Client）角色：创建处理链，并向链头的具体处理者对象提交请求，它不关心处理细节和请求的传递过程。
 */
public class Client {
    public static void main(String[] args) {
        Handler handlerA = new ConcreteHandlerA();
        Handler handlerB = new ConcreteHandlerB();
        handlerA.setHandler(handlerB);
        handlerA.handlerRequest("two");
    }
}
