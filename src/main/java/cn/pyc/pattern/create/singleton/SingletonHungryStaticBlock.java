package cn.pyc.pattern.create.singleton;

/**
 * @author pi
 * @date 2021/07/04 23:55:15
 **/
public class SingletonHungryStaticBlock {

    private static SingletonHungryStaticBlock singletonHungry;

    //在静态代码块中，创建单例对象
    static {
        singletonHungry = new SingletonHungryStaticBlock();
    }

    //构造器私有化
    private SingletonHungryStaticBlock() {
    }

    public static SingletonHungryStaticBlock getInstance() {
        return singletonHungry;
    }
}
