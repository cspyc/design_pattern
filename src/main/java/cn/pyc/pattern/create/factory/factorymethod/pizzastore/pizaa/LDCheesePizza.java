package cn.pyc.pattern.create.factory.factorymethod.pizzastore.pizaa;

/**
 * @author pi
 * @date 2021/07/09 00:30:02
 **/
public class LDCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("London奶酪");
        System.out.println("London奶酪披萨....");
    }
}
