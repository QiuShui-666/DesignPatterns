package com.atguigu.factory_pattern.simple_factory_pattern.pizza_store.order;

import com.atguigu.factory_pattern.simple_factory_pattern.pizza_store.pizza.CheesePizza;
import com.atguigu.factory_pattern.simple_factory_pattern.pizza_store.pizza.GreekPizza;
import com.atguigu.factory_pattern.simple_factory_pattern.pizza_store.pizza.PepperPizza;
import com.atguigu.factory_pattern.simple_factory_pattern.pizza_store.pizza.Pizza;

public class SimpleFactory {

    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        switch (orderType) {
            case "greek":
                pizza = new GreekPizza();
                break;
            case "cheese":
                pizza = new CheesePizza();
                break;
            case "pepper":
                pizza = new PepperPizza();
                break;
            default:
                System.out.println("暂时没有这种类型的披萨！！！");
                break;
        }
        return pizza;
    }

}
