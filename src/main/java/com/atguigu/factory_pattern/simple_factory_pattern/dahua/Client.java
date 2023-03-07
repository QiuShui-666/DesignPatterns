package com.atguigu.factory_pattern.simple_factory_pattern.dahua;

public class Client {

    public static void main(String[] args) {
        Operation operation = OperationFactory.createOperation("/");
        operation.setNumber1(10);
        operation.setNumber2(5);
        System.out.println(operation.getResult());
    }

}
