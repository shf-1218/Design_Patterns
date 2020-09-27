package com.design.behavior.memento;

/**
 * @program: Design Patterns
 * @Date: 2020/9/27 15:52
 * @Author: Mr.Shen
 */
public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("S0");
        System.out.println(originator.getState());
        Memento memento = originator.createMemento();
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(memento);
        originator.setState("S1");
        System.out.println(originator.getState());
        originator.restoreMemento(caretaker.getMemento());
        System.out.println(originator.getState());
    }
}
