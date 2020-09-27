package com.design.structure.adapter.clazz;

/**
 * @program: Design Patterns
 * @Date: 2020/9/25 11:52
 * @Author: Mr.Shen
 * 适配者（Adaptee）类：它是被访问和适配的现存组件库中的组件接口
 */
public class Adaptee {
    public void specificRequest() {
        System.out.println("适配者中的业务代码被调用！");
    }
}
