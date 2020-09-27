package com.design.creation.builder;

/**
 * @program: Design Patterns
 * @Date: 2020/9/25 11:15
 * @Author: Mr.Shen
 */
public class Product {
    private String param;

    public void show(){
        System.out.println("----Product----");
    }

    @Override
    public String toString() {
        return "Product{" +
                "param='" + param + '\'' +
                '}';
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }
}
