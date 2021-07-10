package cn.pyc.pattern.create.factory.abstractfactory.pizzastore.order;

import cn.pyc.pattern.create.factory.abstractfactory.pizzastore.pizza.BJCheesePizza;
import cn.pyc.pattern.create.factory.abstractfactory.pizzastore.pizza.BJPepperPizza;
import cn.pyc.pattern.create.factory.abstractfactory.pizzastore.pizza.Pizza;

/**
 * @author pi
 * @date 2021/07/10 22:37:50
 **/
public class BjFactory implements AbstractFactory {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if ("cheese".equals(orderType)) {
            pizza = new BJCheesePizza();
        } else if ("pepper".equals(orderType)) {
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
