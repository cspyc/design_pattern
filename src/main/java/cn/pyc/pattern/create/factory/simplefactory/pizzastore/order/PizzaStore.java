package cn.pyc.pattern.create.factory.simplefactory.pizzastore.order;

/**
 * @author pi
 * @date 2021/07/06 23:26:07
 * 客户端：发起披萨订单
 **/
public class PizzaStore {
    public static void main(String[] args) {
//        OrderPizza orderPizza = new OrderPizza();
        //使用简单工厂模式
        new OrderPizzaImproveToSimpleFactory(new SimpleFactory());
        System.out.println("退出程序~~");
    }
}
