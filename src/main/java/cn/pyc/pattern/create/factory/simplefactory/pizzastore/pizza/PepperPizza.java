package cn.pyc.pattern.create.factory.simplefactory.pizzastore.pizza;

/**
 * @author pi
 * @date 2021/07/06 23:34:09
 **/
public class PepperPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("准备胡椒披萨....");
    }
}
