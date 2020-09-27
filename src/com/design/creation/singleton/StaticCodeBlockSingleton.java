package com.design.creation.singleton;

/**
 * @program: Design Patterns
 * @Date: 2020/9/24 16:00
 * @Author: Mr.Shen
 * 饿汉式(静态代码块)【可用】
 * 优点：写法比较简单，在类装载的时候就完成实例化,只不过类实例化的过程放在了静态代码块，避免了线程同步问题
 * 缺点：类装载的时候就完成实例化，没有达到Lazy Loading的效果。如果从始至终从未使用过这个实例，则会造成内存的浪费。
 */
public class StaticCodeBlockSingleton {

    private static final StaticCodeBlockSingleton instance;

    /**
     * 静态代码块
     */
    static {
        instance = new StaticCodeBlockSingleton();
    }

    /**
     * 构造器私有化
     */
    private StaticCodeBlockSingleton() {
    }

    /**
     * 提供对外获取静态实例的方法
     *
     * @return
     */
    public static StaticCodeBlockSingleton getInstance() {
        return instance;
    }
}
