package com.design.structure.proxy.staticProxy;

/**
 * @program: Design Patterns
 * @Date: 2020/9/25 21:46
 * @Author: Mr.Shen
 */
public class Client {
    public static void main(String[] args) {
        Subject subject = new Proxy(new RealSubject());
        subject.request();
    }
}
