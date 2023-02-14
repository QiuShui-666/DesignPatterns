package com.atguigu.principle.interface_segregation_principles.improve;

/**
 * A 通过 Interface1、Interface2 依赖 B
 * A 会用到 Interface1 的 1 方法
 * A 会用到 Interface2 的 2、3 方法
 */
public class A {

    public void depend1(Interface1 i) {
        i.operation1();
    }

    public void depend2(Interface2 i) {
        i.operation2();
    }

    public void depend3(Interface2 i) {
        i.operation3();
    }

}
