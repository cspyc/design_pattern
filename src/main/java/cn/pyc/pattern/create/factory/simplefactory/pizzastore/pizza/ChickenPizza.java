package cn.pyc.pattern.create.factory.simplefactory.pizzastore.pizza;

/**
 * @author pi
 * @date 2021/07/06 00:05:23
 **/
public class ChickenPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("给鸡肉披萨准备原材料");
    }
}
