package cn.pyc.pattern.create.factory.simplefactory.pizzastore.pizza;

/**
 * @author pi
 * @date 2021/07/06 23:51:17
 **/
public class ChinaPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("准备中国pizza");
    }
}
