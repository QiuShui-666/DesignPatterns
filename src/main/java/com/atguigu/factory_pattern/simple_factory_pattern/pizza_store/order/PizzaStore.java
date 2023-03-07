package com.atguigu.factory_pattern.simple_factory_pattern.pizza_store.order;

public class PizzaStore {

    public static void main(String[] args) {
//        new OrderPizza();
        new OrderPizza(new SimpleFactory());
    }

}
