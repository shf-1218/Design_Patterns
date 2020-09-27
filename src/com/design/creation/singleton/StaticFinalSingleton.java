package com.design.creation.singleton;

/**
 * @program: Design Patterns
 * @Date: 2020/9/24 15:54
 * @Author: Mr.Shen
 * 饿汉式(静态常量)【可用】
 * 优点：写法比较简单，在类装载的时候就完成实例化，避免了线程同步问题
 * 缺点：类装载的时候就完成实例化，没有达到Lazy Loading的效果。如果从始至终从未使用过这个实例，则会造成内存的浪费。
 */
public class StaticFinalSingleton {
    private static final StaticFinalSingleton instance = new StaticFinalSingleton();

    /**
     * 构造器私有化
     */
    private StaticFinalSingleton() {
    }

    /**
     * 提供对外获取静态实例的方法
     *
     * @return
     */
    public static StaticFinalSingleton getInstance() {
        return instance;
    }
}
