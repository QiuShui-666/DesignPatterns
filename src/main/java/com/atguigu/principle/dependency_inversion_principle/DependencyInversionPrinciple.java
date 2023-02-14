package com.atguigu.principle.dependency_inversion_principle;

public class DependencyInversionPrinciple {

    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }

}

class Email {

    public String getInfo() {
        return "电子邮件信息：hello，world！！！";
    }

}

/*
完成 Person 接收消息的功能
方式 1 分析：
1. 简单，比较容易想到。
2. 如果想要获取微信，短信等等，则新增类。同时 Person 也要增加相应的接收方法
3. 解决思路：引入一个抽象的接口 IReceiver，表示接受者，这样 Person 类与接口 IReceiver 发生依赖
因为 Email，微信等属于接收的范围，他们各自实现 IReceiver 接口就 OK，我们就符合依赖倒置原则
 */
class Person {

    public void receive(Email email) {
        System.out.println(email.getInfo());
    }

}
