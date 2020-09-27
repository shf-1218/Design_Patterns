package com.design.structure.bridge;

/**
 * @program: Design Patterns
 * @Date: 2020/9/25 14:32
 * @Author: Mr.Shen
 * 具体实现化（Concrete Implementor）角色：给出实现化角色接口的具体实现
 */
public class ConcreteImplementorB implements Implementor {
    @Override
    public void operation() {
        System.out.println("具体实现化(Concrete Implementor B)角色被访问");
    }
}
