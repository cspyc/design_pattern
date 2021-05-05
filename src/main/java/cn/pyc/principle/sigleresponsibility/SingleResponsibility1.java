package cn.pyc.principle.sigleresponsibility;

/**
 * @author Pi
 * @date 2021-05-05 09:29
 */
public class SingleResponsibility1 {
    public static void main(String[] args) {
        Vehicle1 vehicle1 = new Vehicle1();
        vehicle1.run("摩托车");
        vehicle1.run("汽车");
        vehicle1.run("飞机");
    }
}

//交通工具类
//在run方法中违反了单一职责原则
class Vehicle1 {
    public void run(String vehicle) {
        System.out.println(vehicle + "在公路上运行....");
    }
}
