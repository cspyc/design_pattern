package cn.pyc.pattern.create.builder.improve;

/**
 * @author pi
 * @date 2021/07/12 23:10:50
 **/
public class CommonHouseBuilder extends HouseBuilder {
    @Override
    public void buildBase() {
        System.out.println("建造普通房子地基");
    }

    @Override
    public void buildWall() {
        System.out.println("建造普通房子墙");
    }

    @Override
    public void roofed() {
        System.out.println("建造普通房子屋顶");
    }
}
