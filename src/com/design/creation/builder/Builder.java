package com.design.creation.builder;

/**
 * @program: Design Patterns
 * @Date: 2020/9/25 11:13
 * @Author: Mr.Shen
 * @Description:
 */
public abstract class Builder {
    protected Product product;

    public Builder() {
        this.product = new Product();
    }

    protected abstract void buildParam();

    public Product getResult() {
        return product;
    }
}
