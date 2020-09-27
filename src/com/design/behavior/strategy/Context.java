package com.design.behavior.strategy;

/**
 * @program: Design Patterns
 * @Date: 2020/9/27 11:29
 * @Author: Mr.Shen
 * 环境（Context）类：持有一个策略类的引用，最终给客户端调用
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }
    public void strategy(){
        this.strategy.strategyMethod();
    }
}
