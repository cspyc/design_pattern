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
public class OrderPizzaImproveToSimpleFactory {

    Pizza pizza = null;
    SimpleFactory simpleFactory;

    //聚合关系
    public OrderPizzaImproveToSimpleFactory(SimpleFactory simpleFactory) {
        setSimpleFactory(simpleFactory);
    }

    public void setSimpleFactory(SimpleFactory simpleFactory) {
        this.simpleFactory = simpleFactory;
        String orderType = "";//用户输入披萨类型

        do {
            orderType = getOrderPizzaType();
            pizza = this.simpleFactory.createPizza(orderType);

            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
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
