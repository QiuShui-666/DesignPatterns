package com.atguigu.factory_pattern.factory_method_pattern.pizza_store.pizza;

public class BJGreekPizza extends Pizza {

    public BJGreekPizza() {
        super();
        super.name = "北京希腊披萨";
    }

    @Override
    public void prepare() {
        System.out.println("给" + name + "准备原材料！！！");
    }


}
