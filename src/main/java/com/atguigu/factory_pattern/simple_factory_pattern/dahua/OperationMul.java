package com.atguigu.factory_pattern.simple_factory_pattern.dahua;

public class OperationMul extends Operation {

    @Override
    public double getResult() {
        return getNumber1() * getNumber2();
    }

}
