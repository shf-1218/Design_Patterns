package com.design.behavior.interpreter;

/**
 * @program: Design Patterns
 * @Date: 2020/9/27 18:07
 * @Author: Mr.Shen
 * 非终结符表达式（Nonterminal Expression）角色：也是抽象表达式的子类，用来实现文法中与非终结符相关的操作，文法中的每条规则都对应于一个非终结符表达式。
 */
public class NonterminalExpression implements AbstractExpression{
    private AbstractExpression left;
    private AbstractExpression right;
    @Override
    public void interpret(String info) {

    }
}
