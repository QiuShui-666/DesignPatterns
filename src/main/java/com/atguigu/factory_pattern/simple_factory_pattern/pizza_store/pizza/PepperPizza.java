package com.atguigu.factory_pattern.simple_factory_pattern.pizza_store.pizza;

public class PepperPizza extends Pizza {

    public PepperPizza() {
        super();
        super.name = "胡椒披萨";
    }

    @Override
    public void prepare() {
        System.out.println("给" + name + "准备原材料！！！");
    }

}
