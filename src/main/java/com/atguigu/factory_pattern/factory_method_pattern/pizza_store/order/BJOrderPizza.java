package com.atguigu.factory_pattern.factory_method_pattern.pizza_store.order;

import com.atguigu.factory_pattern.factory_method_pattern.pizza_store.pizza.BJCheesePizza;
import com.atguigu.factory_pattern.factory_method_pattern.pizza_store.pizza.BJGreekPizza;
import com.atguigu.factory_pattern.factory_method_pattern.pizza_store.pizza.Pizza;

public class BJOrderPizza extends OrderPizza{

    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals("greek")) {
            pizza = new BJGreekPizza();
        }
        return pizza;
    }

}
