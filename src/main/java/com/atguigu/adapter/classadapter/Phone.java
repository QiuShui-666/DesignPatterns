package com.atguigu.adapter.classadapter;

public class Phone {

    public void charge(IVoltage5V iVoltage5V) {
        if (iVoltage5V.output5V() == 5) {
            System.out.println("电压为 5V，可以充电！！！");
        } else if (iVoltage5V.output5V() > 5) {
            System.out.println("电压大于 5V，不能充电！！！");
        }
    }

}
