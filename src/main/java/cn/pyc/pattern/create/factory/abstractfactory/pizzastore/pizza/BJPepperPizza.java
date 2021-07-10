package cn.pyc.pattern.create.factory.abstractfactory.pizzastore.pizza;

/**
 * @author pi
 * @date 2021/07/09 00:28:19
 **/
public class BJPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京胡椒");
        System.out.println("北京胡椒披萨....");
    }
}
