package com.atguigu.prototype_pattern.deep_clone;

public class Client {

    public static void main(String[] args) {
//        // 方式一
//        DeepProtoType deepProtoType = new DeepProtoType();
//        deepProtoType.setName("宋江");
//        deepProtoType.setDeepCloneableTarget(new DeepCloneableTarget("李逵", "黑旋风"));
//        DeepProtoType deepProtoType1 = deepProtoType.clone();
//
//        System.out.println("deepProtoType.name = " + deepProtoType.getName() + ",\n" +
//                "deepCloneableTarget.hashcode = " + deepProtoType.getDeepCloneableTarget().hashCode());
//        System.out.println("deepProtoType1.name = " + deepProtoType1.getName() + ",\n" +
//                "deepCloneableTarget1.hashcode = " + deepProtoType1.getDeepCloneableTarget().hashCode() );

        // 方式二
        DeepProtoType deepProtoType = new DeepProtoType();
        deepProtoType.setName("宋江");
        deepProtoType.setDeepCloneableTarget(new DeepCloneableTarget("李逵", "黑旋风"));
        DeepProtoType deepProtoType1 = deepProtoType.deepClone();

        System.out.println("deepProtoType.name = " + deepProtoType.getName() + ",\n" +
                "deepCloneableTarget.hashcode = " + deepProtoType.getDeepCloneableTarget().hashCode());
        System.out.println("deepProtoType1.name = " + deepProtoType1.getName() + ",\n" +
                "deepCloneableTarget1.hashcode = " + deepProtoType1.getDeepCloneableTarget().hashCode() );
    }

}
