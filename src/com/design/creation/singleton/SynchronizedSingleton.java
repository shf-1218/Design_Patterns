package com.design.creation.singleton;

/**
 * @program: Design Patterns
 * @Date: 2020/9/24 16:07
 * @Author: Mr.Shen
 * 懒汉式(线程安全)【不推荐使用】
 * 优点：解决了线程安全问题
 * 缺点：效率太低了，每个线程在想获得类的实例时候，执行getInstance()方法都要进行同步
 */
public class SynchronizedSingleton {
    private static SynchronizedSingleton instance;

    /**
     * 构造器私有化
     */
    private SynchronizedSingleton() {
    }

    /**
     * 提供对外获取静态实例的方法
     *
     * @return
     */
    public static synchronized SynchronizedSingleton getInstance() {
        if (null == instance) {
            instance = new SynchronizedSingleton();
        }
        return instance;
    }
}
