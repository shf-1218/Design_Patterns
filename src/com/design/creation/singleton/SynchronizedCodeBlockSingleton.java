package com.design.creation.singleton;

/**
 * @program: Design Patterns
 * @Date: 2020/9/24 16:14
 * @Author: Mr.Shen
 * 懒汉式(线程不安全)【不可用】
 * 缺点：由于方法同步效率太低，所以摒弃同步方法，改为同步产生实例化的的代码块。但是这种同步并不能起到线程同步的作用
 */
public class SynchronizedCodeBlockSingleton {

    private static SynchronizedCodeBlockSingleton instance;

    /**
     * 构造器私有化
     */
    private SynchronizedCodeBlockSingleton() {
    }

    /**
     * 提供对外获取静态实例的方法
     *
     * @return
     */
    public static SynchronizedCodeBlockSingleton getInstance() {
        if (null == instance) {
            synchronized (SynchronizedCodeBlockSingleton.class) {
                instance = new SynchronizedCodeBlockSingleton();
            }
        }
        return instance;
    }
}
