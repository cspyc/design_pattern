package cn.pyc.pattern.create.factory.abstractfactory.pizzastore.order;

/**
 * @author pi
 * @date 2021/07/10 22:47:55
 **/
public class PizzaStore {
    public static void main(String[] args) {
        new OrderPizza(new LdFactory());
    }
}
