package com.design.behavior.interpreter;

/**
 * @program: Design Patterns
 * @Date: 2020/9/27 18:08
 * @Author: Mr.Shen
 * 环境（Context）角色：通常包含各个解释器需要的数据或是公共的功能，一般用来传递被所有解释器共享的数据，后面的解释器可以从这里获取这些值
 */
public class Context {
    private AbstractExpression abstractExpression;

    public void operation(String info) {
        this.abstractExpression.interpret(info);
    }

}
