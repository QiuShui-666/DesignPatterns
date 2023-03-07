package com.atguigu.factory_pattern.simple_factory_pattern.dahua;

public class OperationAdd extends Operation {

    @Override
    public double getResult() {
        return getNumber1() + getNumber2();
    }

}
