package com.atguigu.factory_pattern.abstract_factory_pattern.pizza_store.order;

import com.atguigu.factory_pattern.abstract_factory_pattern.pizza_store.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {

    private AbsFactory absFactory;

    public AbsFactory getAbsFactory() {
        return absFactory;
    }

    public void setAbsFactory(AbsFactory absFactory) {
        this.absFactory = absFactory;
    }

    public void setFactory(AbsFactory absFactory) {
        setAbsFactory(absFactory);
        Pizza pizza;
        String orderType;
        do {
            orderType = getType();
            pizza = getAbsFactory().createPizza(orderType);
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("订购失败！！！");
                break;
            }
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
