package com.atguigu.singleton_pattern.type1;

public class SingletonTest01 {

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
饿汉式（静态常量）
 */
class  Singleton {

    /**
     * 2. 本类的内部创建对象实例
     * 并赋值给静态常量属性上
     */
    private static final Singleton instance = new Singleton();

    /**
     * 1. 构造器私有化，外部不能 new
     */
    private Singleton() {
    }

    /**
     * 3. 提供一个公有的静态方法，返回实例对象
     * @return Singleton
     */
    public static Singleton getInstance() {
        return instance;
    }
}