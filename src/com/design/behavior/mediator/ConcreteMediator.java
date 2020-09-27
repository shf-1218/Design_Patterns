package com.design.behavior.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: Design Patterns
 * @Date: 2020/9/27 16:29
 * @Author: Mr.Shen
 * 具体中介者（ConcreteMediator）角色：实现中介者接口，定义一个 List 来管理同事对象，协调各个同事角色之间的交互关系，因此它依赖于同事角色。
 */
public class ConcreteMediator extends Mediator {
    private List<Colleague> colleagueList = new ArrayList<>();

    @Override
    public void register(Colleague colleague) {
        colleagueList.add(colleague);
    }

    @Override
    public void relay(Colleague colleague) {
        colleagueList.forEach(coll -> {
            if (coll != colleague) {
                coll.receive();
            }
        });
    }
}
