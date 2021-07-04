package cn.pyc.pattern.create.singleton;

/**
 * @author pi
 * @date 2021/07/04 23:58:15
 **/
public class SingletonLazy {

    private static SingletonLazy instance;

    private SingletonLazy() {
    }

    //使用时才创建，懒汉式
    public static SingletonLazy getInstance() {
        if (instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }
}
