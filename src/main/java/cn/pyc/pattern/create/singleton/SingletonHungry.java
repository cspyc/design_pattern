package cn.pyc.pattern.create.singleton;

/**
 * @author pi
 * @date 2021/07/04 23:47:01
 * 饿汉式-静态变量
 **/
public class SingletonHungry {

    private final static SingletonHungry singletonHungry = new SingletonHungry();

    private SingletonHungry() {
    }

    public static SingletonHungry getInstance() {
        return singletonHungry;
    }
}
