package com.atguigu.factory_pattern.simple_factory_pattern.pizza_store.pizza;

public class GreekPizza extends Pizza {

    public GreekPizza() {
        super();
        super.name = "希腊披萨";
    }

    @Override
    public void prepare() {
        System.out.println("给" + name + "准备原材料！！！");
    }


}
