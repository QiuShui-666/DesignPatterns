package com.atguigu.factory_pattern.simple_factory_pattern.dahua;

public abstract class Operation {

    private double number1;

    private double number2;

    public double getNumber1() {
        return number1;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "number1=" + number1 +
                ", number2=" + number2 +
                '}';
    }

    public abstract double getResult();

}
