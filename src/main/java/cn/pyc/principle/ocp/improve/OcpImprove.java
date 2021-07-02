package cn.pyc.principle.ocp.improve;

/**
 * @author pi
 * @date 2021/07/03 00:19:32
 **/
@SuppressWarnings({"all"})
public class OcpImprove {

    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Triangle());
        graphicEditor.drawShape(new NewBeeGraphic());
    }
}

/**
 * 服务使用方
 */
class GraphicEditor {
    public void drawShape(Shape s) {
        s.draw();
    }
}

/**
 * 服务提供方
 */
abstract class Shape {
    /**
     * 画图形
     */
    abstract void draw();
}

class Rectangle extends Shape {
    public Rectangle() {
    }

    @Override
    void draw() {
        System.out.println("draw rectangle");
    }
}

class Circle extends Shape {
    public Circle() {
    }

    @Override
    void draw() {
        System.out.println("draw circle");
    }
}

/**
 * 增加一种图形
 */
class Triangle extends Shape {
    public Triangle() {
    }

    @Override
    void draw() {
        System.out.println("draw triangle");
    }
}

class NewBeeGraphic extends Shape {

    @Override
    void draw() {
        System.out.println("draw New Bee");
    }
}
