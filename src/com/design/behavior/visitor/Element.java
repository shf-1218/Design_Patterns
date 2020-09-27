package com.design.behavior.visitor;

/**
 * @program: Design Patterns
 * @Date: 2020/9/27 17:51
 * @Author: Mr.Shen
 * 抽象元素（Element）角色：声明一个包含接受操作 accept() 的接口，被接受的访问者对象作为 accept() 方法的参数。
 */
public interface Element {
    void accept(Visitor Visitor);

    void operation();
}
