package cn.pyc.pattern.create.factory.simplefactory.pizzastore.pizza;

/**
 * @author pi
 * @date 2021/07/06 00:04:03
 **/
public class CheesePizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("给奶酪披萨准备原材料......");
    }
}
