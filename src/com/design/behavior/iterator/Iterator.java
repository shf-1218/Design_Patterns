package com.design.behavior.iterator;

/**
 * @program: Design Patterns
 * @Date: 2020/9/27 11:48
 * @Author: Mr.Shen
 * 抽象迭代器（Iterator）角色：定义访问和遍历聚合元素的接口，通常包含 hasNext()、first()、next() 等方法
 */
public interface Iterator {
    Object first();

    Object next();

    boolean hasNext();
}
