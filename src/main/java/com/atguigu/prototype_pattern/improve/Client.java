package com.atguigu.prototype_pattern.improve;

public class Client {

    public static void main(String[] args) {
        Sheep sheep = new Sheep("Tom", 1, "white");
        sheep.setAddress("Xinjiang");
        sheep.setFriend(new Sheep("Jerry", 2, "black"));

        Sheep sheep1 = sheep.clone();
        Sheep sheep2 = sheep.clone();

        System.out.println(sheep + ", sheep.friend = " + sheep.getFriend().hashCode());
        System.out.println(sheep1 + ", sheep1.friend = " + sheep1.getFriend().hashCode());
        System.out.println(sheep2 + ", sheep2.friend = " + sheep2.getFriend().hashCode());
    }

}
