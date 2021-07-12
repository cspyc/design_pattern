package cn.pyc.pattern.create.builder;

/**
 * @author pi
 * @date 2021/07/12 22:50:04
 **/
public abstract class AbstractHouse {

    //打地基
    public abstract void buildBasic();

    //砌墙
    public abstract void buildWalls();

    //封顶
    public abstract void roofed();

    public void build() {
        buildBasic();
        buildWalls();
        roofed();
    }
}
