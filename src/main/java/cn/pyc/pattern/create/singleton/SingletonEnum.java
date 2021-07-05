package cn.pyc.pattern.create.singleton;

/**
 * @author pi
 * @date 2021/07/05 23:35:54
 **/
public class SingletonEnum {
    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;

        System.out.println(instance == instance2);
    }
}

/**
 * 使用枚举实现单例
 */
enum Singleton {
    //属性
    INSTANCE;

    public void sayOk() {
        System.out.println("ok");
    }
}
