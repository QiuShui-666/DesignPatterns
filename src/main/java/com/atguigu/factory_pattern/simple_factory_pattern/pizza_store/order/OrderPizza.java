package com.atguigu.factory_pattern.simple_factory_pattern.pizza_store.order;

import com.atguigu.factory_pattern.simple_factory_pattern.pizza_store.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {

    public SimpleFactory getSimpleFactory() {
        return simpleFactory;
    }

    public void setSimpleFactory(SimpleFactory simpleFactory) {
        this.simpleFactory = simpleFactory;
    }

//    public OrderPizza() {
//        Pizza pizza;
//        String orderType;
//        do {
//            orderType = getType();
//            if (orderType.equals("greek")) {
//                pizza = new GreekPizza();
//            } else if (orderType.equals("cheese")) {
//                pizza = new CheesePizza();
//            } else if (orderType.equals("pepper")) {
//                pizza = new PepperPizza();
//            } else {
//                break;
//            }
//            // 输出 pizza 制作过程
//            pizza.prepare();
//            pizza.bake();
//            pizza.cut();
//            pizza.box();
//        } while (true);
//    }

    public OrderPizza(SimpleFactory simpleFactory) {
        setFactory(simpleFactory);
    }

    private SimpleFactory simpleFactory;

    public void setFactory(SimpleFactory simpleFactory) {
        setSimpleFactory(simpleFactory);

        String orderType;
        Pizza pizza;
        do {
            orderType = getType();
            pizza = getSimpleFactory().createPizza(orderType);
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
