package cn.pyc.pattern.create.factory.factorymethod.pizzastore.order;

import cn.pyc.pattern.create.factory.factorymethod.pizzastore.pizaa.BJCheesePizza;
import cn.pyc.pattern.create.factory.factorymethod.pizzastore.pizaa.BJPepperPizza;
import cn.pyc.pattern.create.factory.factorymethod.pizzastore.pizaa.Pizza;


/**
 * @author pi
 * @date 2021/07/09 00:34:17
 **/
public class BJPizzaFactory extends OrderPizza {

    @Override
    protected Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if ("cheese".equals(orderType)) {
            pizza = new BJCheesePizza();
        } else if ("pepper".equals(orderType)) {
            pizza=  new BJPepperPizza();
        }
        return pizza;
    }
}
