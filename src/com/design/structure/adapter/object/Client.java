package com.design.structure.adapter.object;



/**
 * @program: Design Patterns
 * @Date: 2020/9/25 11:54
 * @Author: Mr.Shen
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        Target adapter=new Adapter(new Adaptee());
        adapter.request();
    }
}
