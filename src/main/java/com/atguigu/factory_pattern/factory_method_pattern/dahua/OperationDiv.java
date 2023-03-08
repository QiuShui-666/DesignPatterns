package com.atguigu.factory_pattern.factory_method_pattern.dahua;

public class OperationDiv extends Operation {

    @Override
    public double getResult() throws ArithmeticException {
        if (getNumber2() == 0)
            throw new ArithmeticException("除数不能为 0！！！");
        return getNumber1() / getNumber2();
    }

}
