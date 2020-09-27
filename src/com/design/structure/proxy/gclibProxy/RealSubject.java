package com.design.structure.proxy.gclibProxy;


import com.design.structure.proxy.jdkProxy.Subject;

/**
 * @program: Design Patterns
 * @Date: 2020/9/25 21:44
 * @Author: Mr.Shen
 * 真实主题（Real Subject）类：实现了抽象主题中的具体业务，是代理对象所代表的真实对象，是最终要引用的对象。
 */
public class RealSubject{
    public void request() {
        System.out.println("访问真实主题方法...");
    }
}
