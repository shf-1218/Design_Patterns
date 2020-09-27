package com.design.creation.singleton;

/**
 * @program: Design Patterns
 * @Date: 2020/9/24 16:03
 * @Author: Mr.Shen
 * 懒汉式(线程不安全)【不可用】
 * 优点：写法起到了Lazy Loading的效果，但是只能在单线程下使用
 * 缺点：在多线程情况下，会产生多个实例，线程不安全
 */
public class LazySingleton {
    private static LazySingleton instance;


    /**
     * 构造器私有化
     */
    private LazySingleton() {
    }

    /**
     * 提供对外获取静态实例的方法
     *
     * @return
     */
    public static LazySingleton getInstance() {
        if (null == instance) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
