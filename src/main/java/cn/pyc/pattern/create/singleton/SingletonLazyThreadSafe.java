package cn.pyc.pattern.create.singleton;

/**
 * @author pi
 * @date 2021/07/04 23:58:15
 * 懒汉式-线程安全
 **/
public class SingletonLazyThreadSafe {

    private static SingletonLazyThreadSafe instance;

    private SingletonLazyThreadSafe() {
    }

    //使用时才创建，懒汉式
    public static synchronized SingletonLazyThreadSafe getInstance() {
        if (instance == null) {
            instance = new SingletonLazyThreadSafe();
        }
        return instance;
    }
}
