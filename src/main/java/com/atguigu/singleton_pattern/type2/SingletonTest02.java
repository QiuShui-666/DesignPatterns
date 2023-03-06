package com.atguigu.singleton_pattern.type2;

public class SingletonTest02 {

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
饿汉式（静态代码块）
 */
class Singleton {

    /**
     * 2. 本类的内部创建对象的引用
     */
    private static final Singleton instance;

    /*
    3. 静态代码块，创建单例对象
     */
    static {
        instance = new Singleton();
    }

    /**
     * 1. 构造器私有化，外部不能 new
     */
    private Singleton() {
    }

    /**
     * 4. 提供一个公有的静态方法，返回实例对象
     *
     * @return Singleton
     */
    public static Singleton getInstance() {
        return instance;
    }
}