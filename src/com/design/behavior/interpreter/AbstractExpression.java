package com.design.behavior.interpreter;

/**
 * @program: Design Patterns
 * @Date: 2020/9/27 18:06
 * @Author: Mr.Shen
 * 抽象表达式（Abstract Expression）角色：定义解释器的接口，约定解释器的解释操作，主要包含解释方法 interpret()
 */
public interface AbstractExpression {
    void interpret(String info);
}
