package cn.pyc.principle.sigleresponsibility;

/**
 * @author Pi
 * @date 2021-05-05 09:32
 */
public class SingleResponsibility2 {
    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("汽车");

        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飞机");

        WaterVehicle waterVehicle = new WaterVehicle();
        waterVehicle.run("汽船");
    }
}

//遵守单一职责原则，每个类分担一个职责
//但是修改大，需要将类分解，对应调用的客户端也需要修改

class RoadVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在公路运行...");
    }
}

class WaterVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在水中运行...");
    }
}

class AirVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在空中运行...");
    }
}