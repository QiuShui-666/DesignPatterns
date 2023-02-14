package com.atguigu.principle.liskov_substitution_principle.improve;

public class LiskovSubstitutionPrinciple {

    public static void main(String[] args) {
        A a = new A();
        System.out.println("11 - 3 = " + a.fun1(11, 3));
        System.out.println("1 - 3 = " + a.fun1(1, 3));

        B b = new B();
        System.out.println("11 + 3 = " + b.fun1(11, 3));
        System.out.println("1 + 3 = " + b.fun1(1, 3));
        System.out.println("2 + 5 + 9 = " + b.fun2(2, 5));
        System.out.println("2 - 5 = " + b.fun3(2, 5));
    }

}

class Base {

}

class A extends Base {

    public int fun1(int num1, int num2) {
        return num1 - num2;
    }

}

class B extends Base {

    private A a = new A();

    public int fun1(int num1, int num2) {
        return num1 + num2;
    }

    public int fun2(int num1, int num2) {
        return fun1(num1, num2) + 9;
    }

    public int fun3(int num1, int num2) {
        return this.a.fun1(num1, num2);
    }


}
