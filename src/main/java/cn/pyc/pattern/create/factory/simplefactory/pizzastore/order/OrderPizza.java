package cn.pyc.pattern.create.factory.simplefactory.pizzastore.order;

import cn.pyc.pattern.create.factory.simplefactory.pizzastore.pizza.CheesePizza;
import cn.pyc.pattern.create.factory.simplefactory.pizzastore.pizza.ChickenPizza;
import cn.pyc.pattern.create.factory.simplefactory.pizzastore.pizza.PepperPizza;
import cn.pyc.pattern.create.factory.simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author pi
 * @date 2021/07/06 00:07:36
 **/
@SuppressWarnings({"all"})
public class OrderPizza {

    public OrderPizza() {
        Pizza pizza = null;
        //订购pizza的类型
        String orderType;

        do {
            orderType = getOrderPizzaType();
            if ("chicken".equals(orderType)) {
                pizza = new ChickenPizza();
            } else if ("cheese".equals(orderType)) {
                pizza = new CheesePizza();
            } else if ("pepper".equals(orderType)) {
                pizza = new PepperPizza();
            } else {
                break;
            }
            pizza.setName(orderType);
            //制作pizza
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } while (true);
    }

    private String getOrderPizzaType() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type :");
            String str = bufferedReader.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
