package cn.pyc.pattern.create.factory.simplefactory.pizzastore.order;

import cn.pyc.pattern.create.factory.simplefactory.pizzastore.pizza.*;

/**
 * @author pi
 * @date 2021/07/06 23:41:29
 * 简单工厂类
 **/
public class SimpleFactory {
    public Pizza createPizza(String orderType) {
        System.out.println("使用简单工厂模式");

        Pizza pizza = null;

        if ("chicken".equals(orderType)) {
            pizza = new ChickenPizza();
            pizza.setName("鸡肉披萨");
        } else if ("cheese".equals(orderType)) {
            pizza = new CheesePizza();
            pizza.setName("奶酪披萨");
        } else if ("pepper".equals(orderType)) {
            pizza = new PepperPizza();
            pizza.setName("胡椒披萨");
        }else if("china".equals(orderType)){
            pizza = new ChinaPizza();
            pizza.setName("中国披萨");
        }

        return pizza;
    }
}
