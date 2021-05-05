package cn.pyc.principle.sigleresponsibility;

/**
 * @author Pi
 * @date 2021-05-05 09:37
 */
public class SingleResponsibility3 {
    public static void main(String[] args) {
        Vehicle2 vehicle2 = new Vehicle2();
        vehicle2.run("汽车");
        vehicle2.runAir("飞机");
        vehicle2.runWater("轮船");
    }
}

//这种修改对原来的类，没有大的修改，只是增加方法
//在类级别上没有遵守单一职责原则；在方法级别上遵守单一职责原则
class Vehicle2 {
    public void run(String vehicle) {
        System.out.println(vehicle + "在公路上运行....");
    }

    public void runAir(String vehicle) {
        System.out.println(vehicle + "在空中运行....");
    }

    public void runWater(String vehicle) {
        System.out.println(vehicle + "在水中运行....");
    }
}
