package com.design.structure.adapter.object;

/**
 * @program: Design Patterns
 * @Date: 2020/9/25 11:51
 * @Author: Mr.Shen
 * 适配器（Adapter）类：它是一个转换器，通过继承或引用适配者的对象，把适配者接口转换成目标接口，让客户按目标接口的格式访问适配者
 */
public class Adapter  implements Target {
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        System.out.println("对象适配器模式测试：");
        this.adaptee.specificRequest();
    }
}
