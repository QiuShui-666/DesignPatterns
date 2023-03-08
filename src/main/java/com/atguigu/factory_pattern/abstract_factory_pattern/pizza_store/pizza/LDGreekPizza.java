package com.atguigu.factory_pattern.abstract_factory_pattern.pizza_store.pizza;

public class LDGreekPizza extends Pizza {

    public LDGreekPizza() {
        super();
        super.name = "伦敦希腊披萨";
    }

    @Override
    public void prepare() {
        System.out.println("给" + name + "准备原材料！！！");
    }


}
