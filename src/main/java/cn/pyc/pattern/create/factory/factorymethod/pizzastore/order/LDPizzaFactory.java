package cn.pyc.pattern.create.factory.factorymethod.pizzastore.order;

import cn.pyc.pattern.create.factory.factorymethod.pizzastore.pizaa.LDCheesePizza;
import cn.pyc.pattern.create.factory.factorymethod.pizzastore.pizaa.LDPepperPizza;
import cn.pyc.pattern.create.factory.factorymethod.pizzastore.pizaa.Pizza;
import com.sun.org.apache.xpath.internal.operations.Or;

/**
 * @author pi
 * @date 2021/07/09 00:37:51
 **/
public class LDPizzaFactory extends OrderPizza {
    @Override
    protected Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if ("cheese".equals(orderType)) {
            pizza = new LDCheesePizza();
        } else if ("pepper".equals(orderType)) {
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
