package com.design.behavior.responsibility;

/**
 * @program: Design Patterns
 * @Date: 2020/9/27 14:39
 * @Author: Mr.Shen
 * 具体处理者（Concrete Handler）角色：实现抽象处理者的处理方法，判断能否处理本次请求，如果可以处理请求则处理，否则将该请求转给它的后继者。
 */
public class ConcreteHandlerB extends Handler {

    @Override
    void handlerRequest(String request) {
        if (request.equals("two")) {
            System.out.println("具体处理者B负责处理该请求！");
        } else {
            if (getHandler() != null) {
                getHandler().handlerRequest(request);
            } else {
                System.out.println("没有人处理该请求！");
            }
        }
    }
}
