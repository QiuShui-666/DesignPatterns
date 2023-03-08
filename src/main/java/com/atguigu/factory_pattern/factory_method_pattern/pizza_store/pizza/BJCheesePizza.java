package com.atguigu.factory_pattern.factory_method_pattern.pizza_store.pizza;

public class BJCheesePizza extends Pizza {

    public BJCheesePizza() {
        super();
        super.name = "北京奶酪披萨";
    }

    @Override
    public void prepare() {
        System.out.println("给" + name + "准备原材料！！！");
    }

}
