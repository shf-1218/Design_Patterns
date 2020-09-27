package com.design.structure.proxy.jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @program: Design Patterns
 * @Date: 2020/9/25 21:54
 * @Author: Mr.Shen
 * 代理（Proxy）类：提供了与真实主题相同的接口，其内部含有对真实主题的引用，它可以访问、控制或扩展真实主题的功能。
 */
public class Proxy implements InvocationHandler {
    private Object target;

    public Proxy(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理开始。");
        Object invoke = method.invoke(target, args);
        System.out.println("代理结束。");
        return invoke;
    }

    public Object createProxy() {
        return java.lang.reflect.Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

}
