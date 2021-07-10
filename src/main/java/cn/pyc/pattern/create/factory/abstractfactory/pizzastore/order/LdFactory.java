package cn.pyc.pattern.create.factory.abstractfactory.pizzastore.order;

import cn.pyc.pattern.create.factory.abstractfactory.pizzastore.pizza.LDCheesePizza;
import cn.pyc.pattern.create.factory.abstractfactory.pizzastore.pizza.LDPepperPizza;
import cn.pyc.pattern.create.factory.abstractfactory.pizzastore.pizza.Pizza;

/**
 * @author pi
 * @date 2021/07/10 22:39:08
 **/
public class LdFactory implements AbstractFactory {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if ("cheese".equals(orderType)) {
            pizza = new LDCheesePizza();
        } else if ("pepper".equals(orderType)) {
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
