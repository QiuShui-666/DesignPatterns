package com.atguigu.singleton_pattern.type4;

public class SingletonTest04 {

    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        // 验证
        System.out.println(instance == instance1);
        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());
    }

}

/*
懒汉式（线程安全，同步方法）
 */
class Singleton {

    private static Singleton instance;

    private Singleton() {
    }

    // 提供一个静态的公共方法，当使用该方法时，才去创建该对象的实例
    // 加入同步处理的代码，解决了线程安全
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

}