package cn.pyc.pattern.create.builder.improve;

import cn.pyc.pattern.create.builder.CommonHouse;

/**
 * @author pi
 * @date 2021/07/12 23:22:32
 **/
public class Client {
    public static void main(String[] args) {
        //盖普通房子
        CommonHouseBuilder commonHouseBuilder = new CommonHouseBuilder();
        HouseDirector houseDirector = new HouseDirector(commonHouseBuilder);
        House house = houseDirector.constructHouse();

        //盖高楼
        HighHouseBuilder highHouseBuilder = new HighHouseBuilder();
        HouseDirector houseDirector1 = new HouseDirector(highHouseBuilder);
        House house1 = houseDirector1.constructHouse();
    }
}
