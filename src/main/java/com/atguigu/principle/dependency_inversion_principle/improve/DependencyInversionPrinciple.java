package com.atguigu.principle.dependency_inversion_principle.improve;

public class DependencyInversionPrinciple {

    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
        person.receive(new WeChat());
    }

}

interface IReceiver {

    String getInfo();

}

class Email implements IReceiver {

    public String getInfo() {
        return "电子邮件信息：hello，world！！！";
    }

}

class WeChat implements IReceiver {

    public String getInfo() {
        return "微信消息：你好呀！！！";
    }

}

/*
完成 Person 接收消息的功能
方式 2 分析：
 */
class Person {

    public void receive(IReceiver iReceiver) {
        System.out.println(iReceiver.getInfo());
    }

}

