package cn.pyc.pattern.create.factory.abstractfactory.pizzastore.pizza;

/**
 * @author pi
 * @date 2021/07/09 00:27:21
 **/
public class BJCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京奶酪");
        System.out.println("北京奶酪披萨....");
    }
}
