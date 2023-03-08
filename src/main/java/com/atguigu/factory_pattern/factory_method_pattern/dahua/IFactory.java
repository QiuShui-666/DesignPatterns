package com.atguigu.factory_pattern.factory_method_pattern.dahua;

/**
 * 工厂方法模式：定义一个用于创建对象的接口，让子类决定实例化那一个类。工厂方法使一个类的实例化延迟到其子类
 * 对比：简单工厂模式和工厂方法模式
 * 简单工厂模式的最大优点在于工厂类中包含了必要的逻辑判断，根据客户端的选择条件动态实例化相关的类，对于客户端来说，去除了与具体产品的依赖。
 * 简单工厂模式的缺点，如果需要增加一个“求 M 数的 N 次方”，我们需要给运算工厂类的方法加“case”的分支条件，这意味着我们不但对扩展开放，对修改也开放了，违反了 OCP 原则。
 * 工厂方法模式，根据依赖倒转原则，把工厂类抽象成一个接口，这个接口只有一个方法，就是创建抽象产品的工厂的方法。
 */
public interface IFactory {

    Operation createOperation();

}

class AddFactory implements IFactory {

    @Override
    public Operation createOperation() {
        return new OperationAdd();
    }

}

class SubFactory implements IFactory {

    @Override
    public Operation createOperation() {
        return new OperationSub();
    }

}

class MulFactory implements IFactory {

    @Override
    public Operation createOperation() {
        return new OperationMul();
    }

}