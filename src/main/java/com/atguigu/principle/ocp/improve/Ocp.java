package com.atguigu.principle.ocp.improve;

public class Ocp {

    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Triangle());
        graphicEditor.drawShape(new OtherShape());
    }

}

class GraphicEditor {

    public void drawShape(Shape s) {
        s.draw();
    }

}

abstract class Shape {

    int m_type;

    /**
     * 绘图的抽象方法
     */
    public abstract void draw();

}

class Rectangle extends Shape {

    public Rectangle() {
        super.m_type = 1;
    }

    @Override
    public void draw() {
        System.out.println("绘制矩形");
    }

}

class Circle extends Shape {

    public Circle() {
        super.m_type = 2;
    }

    @Override
    public void draw() {
        System.out.println("绘制圆形");

    }

}

class Triangle extends Shape {

    public Triangle() {
        super.m_type = 3;

    }

    @Override
    public void draw() {
        System.out.println("绘制三角形");
    }

}

class OtherShape extends Shape {

    public OtherShape() {
        super.m_type = 4;

    }

    @Override
    public void draw() {
        System.out.println("绘制其他图形");
    }

}

