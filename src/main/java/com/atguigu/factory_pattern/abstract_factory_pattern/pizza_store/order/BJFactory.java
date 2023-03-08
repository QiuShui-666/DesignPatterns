package com.atguigu.factory_pattern.abstract_factory_pattern.pizza_store.order;

import com.atguigu.factory_pattern.abstract_factory_pattern.pizza_store.pizza.BJCheesePizza;
import com.atguigu.factory_pattern.abstract_factory_pattern.pizza_store.pizza.BJGreekPizza;
import com.atguigu.factory_pattern.abstract_factory_pattern.pizza_store.pizza.Pizza;

public class BJFactory implements AbsFactory {

    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            return new BJCheesePizza();
        } else if (orderType.equals("greek")) {
            pizza = new BJGreekPizza();
        }
        return pizza;
    }

}
