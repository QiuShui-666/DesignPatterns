package com.atguigu.factory_pattern.factory_method_pattern.dahua;

public class OperationMul extends Operation {

    @Override
    public double getResult() {
        return getNumber1() * getNumber2();
    }

}
