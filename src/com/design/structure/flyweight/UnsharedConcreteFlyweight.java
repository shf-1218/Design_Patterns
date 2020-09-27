package com.design.structure.flyweight;

/**
 * @program: Design Patterns
 * @Date: 2020/9/25 23:00
 * @Author: Mr.Shen
 */
public class UnsharedConcreteFlyweight {
    private String info;

    UnsharedConcreteFlyweight(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
