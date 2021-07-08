package cn.pyc.pattern.create.factory.factorymethod.pizzastore.order;

import cn.pyc.pattern.create.factory.factorymethod.pizzastore.pizaa.Pizza;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author pi
 * @date 2021/07/09 00:30:42
 **/
public abstract class OrderPizza {
    public OrderPizza() {
        Pizza pizza = null;
        //订购pizza的类型
        String orderType;
        do {
            orderType = getOrderPizzaType();
            pizza = createPizza(orderType);

            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }
        } while (true);
    }

    //定义一个抽象方法，让各个工厂子类去实现

    protected abstract Pizza createPizza(String orderType);

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
