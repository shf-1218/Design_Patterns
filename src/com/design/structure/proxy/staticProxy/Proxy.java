package com.design.structure.proxy.staticProxy;

/**
 * @program: Design Patterns
 * @Date: 2020/9/25 21:45
 * @Author: Mr.Shen
 * 代理（Proxy）类：提供了与真实主题相同的接口，其内部含有对真实主题的引用，它可以访问、控制或扩展真实主题的功能。
 */
public class Proxy implements Subject {
    private RealSubject realSubject;

    public Proxy(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public void request() {
        preRequest();
        realSubject.request();
        postRequest();
    }

    private void preRequest() {
        System.out.println("代理开始。");
    }

    private void postRequest() {
        System.out.println("代理结束。");
    }
}
