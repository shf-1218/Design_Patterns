package com.design.behavior.state;

/**
 * @program: Design Patterns
 * @Date: 2020/9/27 16:12
 * @Author: Mr.Shen
 * 抽象状态（State）角色：定义一个接口，用以封装环境对象中的特定状态所对应的行为。
 */
public interface State {
    void Handle(Context context);

}
