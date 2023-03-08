package com.atguigu.prototype_pattern;

public class Client {

    public static void main(String[] args) {
        Sheep sheep = new Sheep("Tom", 3, "white");
        Sheep sheep1 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep sheep2 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());

        System.out.println(sheep);
        System.out.println(sheep1);
        System.out.println(sheep2);
    }

}
