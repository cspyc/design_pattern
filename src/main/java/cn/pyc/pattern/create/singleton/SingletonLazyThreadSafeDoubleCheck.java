package cn.pyc.pattern.create.singleton;

/**
 * @author pi
 * @date 2021/07/04 23:58:15
 * 懒汉式-线程安全,双重检查
 **/
public class SingletonLazyThreadSafeDoubleCheck {

    private static volatile SingletonLazyThreadSafeDoubleCheck instance;

    private SingletonLazyThreadSafeDoubleCheck() {
    }

    //使用时才创建，懒汉式
    public static SingletonLazyThreadSafeDoubleCheck getInstance() {
        if (instance == null) {
            synchronized (SingletonLazyThreadSafeDoubleCheck.class) {
                if (instance == null) {
                    instance = new SingletonLazyThreadSafeDoubleCheck();
                }
            }
        }
        return instance;
    }
}
