package com.atguigu.singleton_pattern.type8;

public class SingletonTest08 {

    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance1 = Singleton.INSTANCE;
        // 验证
        System.out.println(instance == instance1);
        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());
    }

}

/*
枚举方式
 */
enum Singleton {

    INSTANCE;

    public void sayOK() {
        System.out.println("ok");
    }

}