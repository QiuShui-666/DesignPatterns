package com.atguigu.factory_pattern.factory_method_pattern.dahua;

public class Client {

    public static void main(String[] args) {
        IFactory factory = new AddFactory();
        Operation operation = factory.createOperation();
        operation.setNumber1(1);
        operation.setNumber2(2);
        double result = operation.getResult();
        System.out.println(result);
    }

}
