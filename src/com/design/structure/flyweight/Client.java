package com.design.structure.flyweight;

/**
 * @program: Design Patterns
 * @Date: 2020/9/25 22:58
 * @Author: Mr.Shen
 */
public class Client {
    public static void main(String[] args) {
        FlyweightFactory flyweightFactory = new FlyweightFactory();
        Flyweight f01=flyweightFactory.getFlyweight("白");
        Flyweight f02=flyweightFactory.getFlyweight("白");
        Flyweight f03=flyweightFactory.getFlyweight("白");
        Flyweight f11=flyweightFactory.getFlyweight("黑");
        Flyweight f12=flyweightFactory.getFlyweight("黑");
        System.out.println(f01==f02);
        System.out.println(f02==f03);
        System.out.println(f11==f12);
        f01.operation(new UnsharedConcreteFlyweight("第1次调用白。"));
        f02.operation(new UnsharedConcreteFlyweight("第2次调用白。"));
        f03.operation(new UnsharedConcreteFlyweight("第3次调用白。"));
        f11.operation(new UnsharedConcreteFlyweight("第1次调用黑。"));
        f12.operation(new UnsharedConcreteFlyweight("第2次调用黑。"));
    }
}
