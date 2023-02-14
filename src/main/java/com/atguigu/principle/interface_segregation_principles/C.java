package com.atguigu.principle.interface_segregation_principles;

/**
 * C 通过 Interface1 依赖 D
 * C 只会用到 Interface1 的 1、4、5 方法
 */
public class C {

    public void depend1(Interface1 i) {
        i.operation1();
    }

    public void depend4(Interface1 i) {
        i.operation4();
    }

    public void depend5(Interface1 i) {
        i.operation5();
    }

}
