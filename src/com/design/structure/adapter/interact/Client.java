package com.design.structure.adapter.interact;

/**
 * @program: Design Patterns
 * @Date: 2020/9/25 14:18
 * @Author: Mr.Shen
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        new Adapter() {
            @Override
            public void request() {
                System.out.println("接口适配器模式测试：");
            }
        }.request();
    }
}
