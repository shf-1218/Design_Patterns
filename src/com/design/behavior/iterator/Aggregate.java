package com.design.behavior.iterator;

/**
 * @program: Design Patterns
 * @Date: 2020/9/27 11:49
 * @Author: Mr.Shen
 * 抽象聚合（Aggregate）角色：定义存储、添加、删除聚合对象以及创建迭代器对象的接口。
 */
public interface Aggregate {
    void add(Object obj);

    void remove(Object obj);

    Iterator getIterator();
}
