package cn.pyc.principle.liskov;

/**
 * @author Pi
 * @date 2021-05-05 16:34
 */
public class Liskov {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("11 - 2 = " + a.fun1(11, 2));

        //因为B继承了A,很容易会认为使用B调用fun1，还是在调用父类中的fun1,实际上在子类B中被重写了
        B b = new B();
        System.out.println("11 - 2 = " + b.fun1(11, 2));
    }
}

class A {
    public int fun1(int a, int b) {
        return a - b;
    }

    public int fun2(int a, int b) {
        return this.fun1(a, b) * 100;
    }
}

class B extends A {
    //此处重写了fun1方法
    @Override
    public int fun1(int a, int b) {
        return a + b;
    }
}
