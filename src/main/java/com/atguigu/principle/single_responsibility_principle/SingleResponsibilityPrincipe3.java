package com.atguigu.principle.single_responsibility_principle;

public class SingleResponsibilityPrincipe3 {

    public static void main(String[] args) {
        Vehicle2 vehicle2 = new Vehicle2();
        vehicle2.run("汽车");
        vehicle2.runAir("飞机");
        vehicle2.runWater("轮船");
    }

}

class Vehicle2 {

    public void run(String vehicle) {
        System.out.println(vehicle + "在公路上跑！！！");
    }

    public void runAir(String vehicle) {
        System.out.println(vehicle + "在天空上跑！！！");
    }

    public void runWater(String vehicle) {
        System.out.println(vehicle + "在水上跑！！！");
    }

}