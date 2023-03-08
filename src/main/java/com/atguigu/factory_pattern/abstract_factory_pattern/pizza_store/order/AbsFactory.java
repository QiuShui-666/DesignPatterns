package com.atguigu.factory_pattern.abstract_factory_pattern.pizza_store.order;

import com.atguigu.factory_pattern.abstract_factory_pattern.pizza_store.pizza.Pizza;

public interface AbsFactory {

    Pizza createPizza(String orderType);

}
