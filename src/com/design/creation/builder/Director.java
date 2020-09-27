package com.design.creation.builder;

/**
 * @program: Design Patterns
 * @Date: 2020/9/25 11:19
 * @Author: Mr.Shen
 * @Description:
 */
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Product construct() {
        builder.buildParam();
        return builder.getResult();
    }
}
