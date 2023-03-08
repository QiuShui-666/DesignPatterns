package com.atguigu.factory_pattern.abstract_factory_pattern.pizza_store.order;

public class PizzaStore {

    public static void main(String[] args) {
        new OrderPizza().setFactory(new LDFactory());
    }

}
