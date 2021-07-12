package cn.pyc.pattern.create.builder.improve;

/**
 * @author pi
 * @date 2021/07/12 23:11:29
 **/
public class HouseDirector {
    HouseBuilder houseBuilder = null;

    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    //处理建房流程，交给指挥者
    public House constructHouse() {
        houseBuilder.buildBase();
        houseBuilder.buildWall();
        houseBuilder.roofed();

        return houseBuilder.buildHouse();
    }
}
