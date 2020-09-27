package com.design.structure.proxy.jdkProxy;

/**
 * @program: Design Patterns
 * @Date: 2020/9/25 21:58
 * @Author: Mr.Shen
 */
public class Client {
    public static void main(String[] args) {
        Subject subject = (Subject) new Proxy(new RealSubject()).createProxy();
        subject.request();
    }
}
