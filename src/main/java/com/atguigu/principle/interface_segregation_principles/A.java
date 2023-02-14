package com.atguigu.principle.interface_segregation_principles;

/**
 * A 通过 Interface1 依赖 B
 * A 只会用到 Interface1 的 1、2、3 方法
 */
public class A {

    public void depend1(Interface1 i) {
        i.operation1();
    }

    public void depend2(Interface1 i) {
        i.operation2();
    }

    public void depend3(Interface1 i) {
        i.operation3();
    }

}
