package com.atguigu.prototype_pattern.improve;

public class Sheep implements Cloneable {

    private String name;

    private Integer age;

    private String color;

    private String address;

    /*
    如果字段是引用类型，克隆会如何处理？
    答：则会复制引用但不复制引用的对象；因此原始对象及其副本引用同一对象
     */
    private Sheep friend;

    public Sheep() {
    }

    public Sheep(String name, Integer age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Sheep getFriend() {
        return friend;
    }

    public void setFriend(Sheep friend) {
        this.friend = friend;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public Sheep clone() {
        Sheep sheep;
        try {
            sheep = (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
        return sheep;
    }

}
