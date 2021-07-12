package cn.pyc.pattern.create.builder.improve;

/**
 * @author pi
 * @date 2021/07/12 23:10:15
 * 抽象的建造者
 **/
public abstract class HouseBuilder {
    protected House house = new House();

    public abstract void buildBase();

    public abstract void buildWall();

    public abstract void roofed();

    //建造好房子后，将产品返回
    public House buildHouse() {
        return house;
    }
}
