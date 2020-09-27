package com.design.structure.proxy.gclibProxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @program: Design Patterns
 * @Date: 2020/9/25 21:54
 * @Author: Mr.Shen
 * 代理（Proxy）类：提供了与真实主题相同的接口，其内部含有对真实主题的引用，它可以访问、控制或扩展真实主题的功能。
 */
public class Proxy implements MethodInterceptor {

    // 根据一个类型产生代理类，此方法不要求一定放在MethodInterceptor中
    public Object createProxy(Class<?> clazz) {
        Enhancer enhancer = new Enhancer();

        enhancer.setSuperclass(clazz);

        enhancer.setCallback(this);

        enhancer.setClassLoader(clazz.getClassLoader());

        return enhancer.create();
    }


    @Override
    public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("代理开始。");
        Object invoke = methodProxy.invokeSuper(proxy, args);
        System.out.println("代理结束。");
        return invoke;
    }
}
