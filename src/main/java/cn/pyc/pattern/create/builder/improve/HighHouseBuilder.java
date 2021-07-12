package cn.pyc.pattern.create.builder.improve;

/**
 * @author pi
 * @date 2021/07/12 23:18:01
 **/
public class HighHouseBuilder extends HouseBuilder {

    @Override
    public void buildBase() {
        System.out.println("建造高层房子地基");
    }

    @Override
    public void buildWall() {
        System.out.println("建造高层房子墙");
    }

    @Override
    public void roofed() {
        System.out.println("建造高层房子屋顶");
    }
}
