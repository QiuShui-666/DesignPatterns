package com.atguigu.principle.ocp;

public class Ocp {

    public static void main(String[] args) {
        // 使用看看存在的问题
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Triangle());
    }

}

/*
绘图类[使用方]
 */
class GraphicEditor {

    public void drawShape(Shape s) {
        if (s.m_type == 1) {
            drawRectangle(s);
        } else if (s.m_type == 2) {
            drawCircle(s);
        } else if (s.m_type == 3) {
            drawTriangle(s);
        }
    }

    public void drawRectangle(Shape s) {
        System.out.println(s.m_type);
        System.out.println("绘制矩形");
    }

    public void drawCircle(Shape s) {
        System.out.println(s.m_type);
        System.out.println("绘制圆形");
    }

    public void drawTriangle(Shape s) {
        System.out.println(s.m_type);
        System.out.println("绘制三角形");
    }


}

class Shape {

    int m_type = 1;

}

class Rectangle extends Shape {

    public Rectangle() {
        super.m_type = 1;
    }

}

class Circle extends Shape {

    public Circle() {
        super.m_type = 2;
    }

}

/*
新增三角形
 */
class Triangle extends Shape {

    public Triangle() {
        super.m_type = 3;
    }

}
