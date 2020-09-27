package com.design.structure.facade;

/**
 * @program: Design Patterns
 * @Date: 2020/9/25 16:05
 * @Author: Mr.Shen
 * 外观（Facade）角色：为多个子系统对外提供一个共同的接口
 */
public class Facade {
    private SubSystemA subSystemA;
    private SubSystemB subSystemB;
    private SubSystemC subSystemC;

    public Facade() {
        this.subSystemA = new SubSystemA();
        this.subSystemB = new SubSystemB();
        this.subSystemC = new SubSystemC();
    }

    public void operation(){
        this.subSystemA.operationA();
        this.subSystemB.operationB();
        this.subSystemC.operationC();
    }
}
