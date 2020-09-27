package com.design.creation.singleton;

/**
 * @program: Design Patterns
 * @Date: 2020/9/24 16:23
 * @Author: Mr.Shen
 * 双重检查(线程安全)【推荐用】
 * 优点：线程安全；延迟加载；效率较高
 */
public class DoubleCheckSingleton {
    private static volatile DoubleCheckSingleton instance;

    /**
     * 构造器私有化
     */
    private DoubleCheckSingleton() {
    }

    /**
     * 提供对外获取静态实例的方法
     *
     * @return
     */
    public static DoubleCheckSingleton getInstance() {
        if (null == instance) {
            synchronized (DoubleCheckSingleton.class) {
                if (null == null) {
                    instance = new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}
