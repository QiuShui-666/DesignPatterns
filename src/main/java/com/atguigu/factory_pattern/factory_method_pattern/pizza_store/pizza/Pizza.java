package com.atguigu.factory_pattern.factory_method_pattern.pizza_store.pizza;

public abstract class Pizza {

    protected String name;

    /**
     * 准备原材料，不同的披萨，需要的原材料不一样
     */
    public abstract void prepare();

    public void bake() {
        System.out.println(name + " baking;");
    }

    public void cut() {
        System.out.println(name + " cutting;");
    }

    public void box() {
        System.out.println(name + " boxing;");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
