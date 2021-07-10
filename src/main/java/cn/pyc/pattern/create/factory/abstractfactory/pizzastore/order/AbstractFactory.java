package cn.pyc.pattern.create.factory.abstractfactory.pizzastore.order;

import cn.pyc.pattern.create.factory.abstractfactory.pizzastore.pizza.Pizza;

/**
 * @author pi
 * @date 2021/07/10 22:36:01
 * 抽象工厂模式的抽象层(接口)
 **/
public interface AbstractFactory {

    /**
     * 创建pizza功能，具体由子类实现
     *
     */
    Pizza createPizza(String orderType);
}
