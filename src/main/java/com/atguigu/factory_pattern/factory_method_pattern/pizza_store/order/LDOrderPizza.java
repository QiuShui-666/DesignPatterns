package com.atguigu.factory_pattern.factory_method_pattern.pizza_store.order;

import com.atguigu.factory_pattern.factory_method_pattern.pizza_store.pizza.Pizza;

public class LDOrderPizza extends OrderPizza{
    @Override
    public Pizza createPizza(String orderType) {
        return null;
    }
}
