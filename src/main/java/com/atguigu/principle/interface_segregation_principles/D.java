package com.atguigu.principle.interface_segregation_principles;

public class D implements Interface1 {

    @Override
    public void operation1() {
        System.out.println("D 实现了 operation1");
    }

    @Override
    public void operation2() {
        System.out.println("D 实现了 operation2");
    }

    @Override
    public void operation3() {
        System.out.println("D 实现了 operation3");
    }

    @Override
    public void operation4() {
        System.out.println("D 实现了 operation4");
    }

    @Override
    public void operation5() {
        System.out.println("D 实现了 operation5");
    }

}
