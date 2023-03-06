package com.atguigu.singleton_pattern.type5;

public class SingletonTest05 {

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
懒汉式（线程不安全，同步代码块）
 */
class Singleton {

    private static Singleton instance;

    private Singleton() {
    }

    // 提供一个静态的公共方法，当使用该方法时，才去创建该对象的实例
    // 加入同步代码块，没有解决线程安全
    public static  Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                instance = new Singleton();
            }
        }
        return instance;
    }

}