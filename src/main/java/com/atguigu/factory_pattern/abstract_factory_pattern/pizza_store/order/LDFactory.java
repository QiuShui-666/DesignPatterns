package com.atguigu.factory_pattern.abstract_factory_pattern.pizza_store.order;

import com.atguigu.factory_pattern.abstract_factory_pattern.pizza_store.pizza.LDCheesePizza;
import com.atguigu.factory_pattern.abstract_factory_pattern.pizza_store.pizza.LDGreekPizza;
import com.atguigu.factory_pattern.abstract_factory_pattern.pizza_store.pizza.Pizza;

public class LDFactory implements AbsFactory {

    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            return new LDCheesePizza();
        } else if (orderType.equals("greek")) {
            pizza = new LDGreekPizza();
        }
        return pizza;
    }

}
