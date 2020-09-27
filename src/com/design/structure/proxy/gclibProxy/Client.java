package com.design.structure.proxy.gclibProxy;

/**
 * @program: Design Patterns
 * @Date: 2020/9/25 22:13
 * @Author: Mr.Shen
 */
public class Client {
    public static void main(String[] args) {
        RealSubject realSubject = (RealSubject) new Proxy().createProxy(RealSubject.class);
        realSubject.request();

    }
}
