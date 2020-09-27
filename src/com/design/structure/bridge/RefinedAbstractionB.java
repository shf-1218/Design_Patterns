package com.design.structure.bridge;

/**
 * @program: Design Patterns
 * @Date: 2020/9/25 14:34
 * @Author: Mr.Shen
 * 扩展抽象化（Refined    Abstraction）角色：是抽象化角色的子类，实现父类中的业务方法，并通过组合关系调用实现化角色中的业务方法。
 */
public class RefinedAbstractionB extends Abstraction {

    public RefinedAbstractionB(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void operationImpl() {
        System.out.println("扩展抽象化(Refined Abstraction B)角色被访问" );
        this.implementor.operation();
    }
}
