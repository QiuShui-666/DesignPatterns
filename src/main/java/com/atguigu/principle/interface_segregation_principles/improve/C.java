package com.atguigu.principle.interface_segregation_principles.improve;

/**
 * C 通过 Interface1、Interface3 依赖 C
 * C 会用到 Interface1 的 1 方法
 * C 会用到 Interface3 的 4、5 方法
 */
public class C {

    public void depend1(Interface1 i) {
        i.operation1();
    }

    public void depend4(Interface3 i) {
        i.operation4();
    }

    public void depend5(Interface3 i) {
        i.operation5();
    }

}
