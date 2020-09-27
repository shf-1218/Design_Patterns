package com.design.creation.builder;

/**
 * @program: Design Patterns
 * @Date: 2020/9/25 11:17
 * @Author: Mr.Shen
 * @Description:
 */
public class ConcreteBuilder extends Builder {
    @Override
    protected void buildParam() {
        product.setParam("A");
    }
}
