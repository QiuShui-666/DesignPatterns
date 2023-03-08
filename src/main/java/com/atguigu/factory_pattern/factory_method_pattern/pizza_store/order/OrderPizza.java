package com.atguigu.factory_pattern.factory_method_pattern.pizza_store.order;

import com.atguigu.factory_pattern.factory_method_pattern.pizza_store.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class OrderPizza {

    // 定义一个抽象的方法，让各个工厂子类实现
    public abstract Pizza createPizza(String orderType);

    public OrderPizza() {
        Pizza pizza;
        String orderType;
        do {
            orderType = getType();
            // 抽象方法，由工厂子类进行完成
            pizza = createPizza(orderType);
            // 输出 pizza 制作过程
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } while (true);
    }

    private String getType() {
        String str = null;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("input pizza type: ");
            str = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }

}
