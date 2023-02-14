package com.atguigu.principle.interface_segregation_principles.improve;

public class Client {

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.depend1(b);
        a.depend2(b);
        a.depend3(b);

        C c = new C();
        D d = new D();
        c.depend1(d);
        c.depend4(d);
        c.depend5(d);
    }

}
