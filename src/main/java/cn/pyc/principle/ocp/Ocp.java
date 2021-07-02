package cn.pyc.principle.ocp;

/**
 * @author pi
 * @date 2021/07/03 00:10:51
 **/
@SuppressWarnings({"all"})
public class Ocp {

    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Triangle());
    }
}

/**
 * 服务使用方
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

    private void drawRectangle(Shape s) {
        System.out.println("draw rectangle");
    }

    private void drawCircle(Shape s) {
        System.out.println("draw circle");
    }

    private void drawTriangle(Shape s) {
        System.out.println("draw triangle");
    }
}

/**
 * 服务提供方
 */
class Shape {
    int m_type;
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

/**
 * 增加一种图形
 */
class Triangle extends Shape {
    public Triangle() {
        super.m_type = 3;
    }
}
