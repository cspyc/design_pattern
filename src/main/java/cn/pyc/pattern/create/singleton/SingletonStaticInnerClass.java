package cn.pyc.pattern.create.singleton;

/**
 * @author pi
 * @date 2021/07/05 00:15:54
 * 静态内部类实现，推荐使用
 **/
public class SingletonStaticInnerClass {

    private SingletonStaticInnerClass() {
    }

    //静态内部类，在外部类加载时，并不会加载
    private static class SingletonInstance {
        private final static SingletonStaticInnerClass instance = new SingletonStaticInnerClass();
    }

    //调用时只会实例化一次
    public static synchronized SingletonStaticInnerClass getInstance() {
        return SingletonInstance.instance;
    }
}
