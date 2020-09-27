package com.design.behavior.template;

/**
 * @program: Design Patterns
 * @Date: 2020/9/26 11:27
 * @Author: Mr.Shen
 */
public abstract class AbstractClass {
    // 模板方法
    public final void templateMethod() {
        this.specificMethod();
        if (hookMethod()) {
            this.abstractMethod();
        }
    }

    private void specificMethod() {
        System.out.println("抽象类中的具体方法被调用...");
    }
    //钩子方法
    protected boolean hookMethod() {
        System.out.println("抽象类中的钩子方法被调用...");
        return true;
    }
    //抽象方法
    protected abstract void abstractMethod();
}
