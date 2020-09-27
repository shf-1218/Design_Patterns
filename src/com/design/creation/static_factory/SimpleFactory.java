package com.design.creation.static_factory;

/**
 * @program: Design Patterns
 * @Date: 2020/9/24 18:15
 * @Author: Mr.Shen
 * 简单工厂（SimpleFactory）:是简单工厂模式的核心，负责实现创建所有实例的内部逻辑。工厂类的创建产品类的方法可以被外界直接调用，创建所需的产品对象。
 */
public class SimpleFactory {

    public static Product makeProduct(String kind) {
        switch (kind) {
            case "A":
                return new ConcreteProductA();
            case "B":
                return new ConcreteProductB();
        }
        return null;
    }
}
