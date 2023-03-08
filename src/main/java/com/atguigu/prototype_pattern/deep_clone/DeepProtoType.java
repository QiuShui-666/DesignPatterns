package com.atguigu.prototype_pattern.deep_clone;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class DeepProtoType implements Serializable, Cloneable {

    private static final long serialVersionUID = -2572163896516915479L;

    public String name;

    public DeepCloneableTarget deepCloneableTarget;

    public DeepProtoType() {
    }

    public DeepProtoType(String name, DeepCloneableTarget deepCloneableTarget) {
        this.name = name;
        this.deepCloneableTarget = deepCloneableTarget;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DeepCloneableTarget getDeepCloneableTarget() {
        return deepCloneableTarget;
    }

    public void setDeepCloneableTarget(DeepCloneableTarget deepCloneableTarget) {
        this.deepCloneableTarget = deepCloneableTarget;
    }

    @Override
    public String toString() {
        return "DeepProtoType{" +
                "name='" + name + '\'' +
                ", deepCloneableTarget=" + deepCloneableTarget +
                '}';
    }

    /**
     * 深拷贝
     * 方式 1：使用 clone 方法
     * @return DeepProtoType
     */
    @Override
    public DeepProtoType clone() {
        DeepProtoType deepProtoType;
        try {
            deepProtoType = (DeepProtoType) super.clone();
            deepProtoType.setDeepCloneableTarget(getDeepCloneableTarget().clone());
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
        return deepProtoType;
    }

    /**
     * 深拷贝
     * 方式 2：通过对象序列化（推荐）
     * @return DeepProtoType
     */
    public DeepProtoType deepClone() {
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        DeepProtoType deepProtoType;
        try {
            // 序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            // 当前这个对象以对象流的方式输出
            oos.writeObject(this);
            // 反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            deepProtoType = (DeepProtoType) ois.readObject();
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return deepProtoType;
    }
}
