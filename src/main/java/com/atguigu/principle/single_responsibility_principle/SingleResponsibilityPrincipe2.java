package com.atguigu.principle.single_responsibility_principle;

public class SingleResponsibilityPrincipe2 {

    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("摩托车");
        roadVehicle.run("汽车");
        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飞机");
        WaterVehicle waterVehicle = new WaterVehicle();
        waterVehicle.run("轮船");

    }

}

/*
方案 2 的分析
1. 遵守单一职责原则
2. 改动很大，类需要分解，并且需要修改客户端
3. 改进：直接修改 vehicle 类，改动的代码会比较少 => 方案 3
 */
class RoadVehicle {

    public void run(String vehicle) {
        System.out.println(vehicle + "在公路上运行！！！");
    }

}

class AirVehicle {

    public void run(String vehicle) {
        System.out.println(vehicle + "在天上运行！！！");
    }

}

class WaterVehicle {

    public void run(String vehicle) {
        System.out.println(vehicle + "在水上运行！！！");
    }

}
