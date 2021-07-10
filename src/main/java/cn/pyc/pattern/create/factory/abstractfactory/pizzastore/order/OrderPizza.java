package cn.pyc.pattern.create.factory.abstractfactory.pizzastore.order;

import cn.pyc.pattern.create.factory.abstractfactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author pi
 * @date 2021/07/10 22:40:45
 **/
public class OrderPizza {
    AbstractFactory abstractFactory;

    public OrderPizza(AbstractFactory abstractFactory) {
        setFactory(abstractFactory);
    }

    private void setFactory(AbstractFactory factory) {
        Pizza pizza = null;
        String orderType = "";//用户输入
        this.abstractFactory = factory;

        do {
            orderType = getOrderPizzaType();
            //传入的factory可能是北京披萨的工厂子类，也有可能是伦敦披萨的工厂子类，多态
            pizza = factory.createPizza(orderType);
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("订购失败！");
                break;
            }
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
