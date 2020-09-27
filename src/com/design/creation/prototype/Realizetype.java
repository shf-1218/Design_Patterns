package com.design.creation.prototype;

/**
 * @program: Design Patterns
 * @Date: 2020/9/24 22:41
 * @Author: Mr.Shen
 * 抽象原型类(Cloneable)：规定了具体原型对象必须实现的接口
 * 具体原型类：实现抽象原型类的 clone() 方法，它是可被复制的对象。
 */
public class Realizetype implements Cloneable {
    public Realizetype() {
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("具体原型复制成功！");
        return super.clone();
    }
}
