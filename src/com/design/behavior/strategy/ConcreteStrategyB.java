package com.design.behavior.strategy;

/**
 * @program: Design Patterns
 * @Date: 2020/9/27 11:28
 * @Author: Mr.Shen
 * 具体策略（Concrete Strategy）类：实现了抽象策略定义的接口，提供具体的算法实现。
 */
public class ConcreteStrategyB implements Strategy {
    @Override
    public void strategyMethod() {
        System.out.println("具体策略B的策略方法被访问！");
    }
}
