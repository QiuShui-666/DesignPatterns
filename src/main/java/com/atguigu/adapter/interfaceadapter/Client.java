package com.atguigu.adapter.interfaceadapter;

public class Client {

    public static void main(String[] args) {
        new AbsAdapter() {

            @Override
            public void m1() {
                System.out.println("使用了 m1 的方法！！！");
            }

        };
    }

}
