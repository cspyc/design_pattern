package cn.pyc.pattern.create.factory.factorymethod.pizzastore.pizaa;

/**
 * @author pi
 * @date 2021/07/09 00:29:20
 **/
public class LDPepperPizza extends Pizza{
    @Override
    public void prepare() {
        setName("London胡椒");
        System.out.println("London胡椒披萨....");
    }
}
