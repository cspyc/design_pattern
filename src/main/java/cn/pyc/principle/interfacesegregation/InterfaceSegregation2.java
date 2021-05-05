package cn.pyc.principle.interfacesegregation;

/**
 * @author Pi
 * @date 2021-05-05 10:33
 */
public class InterfaceSegregation2 {
    public static void main(String[] args) {

        B_ b = new B_();
        A_ a = new A_();
        a.depend1(b);//A_类通过接口去依赖B_类
        a.depend2(b);
        a.depend3(b);

        D_ d = new D_();
        C_ c = new C_();
        c.depend1(d);//A_类通过接口去依赖D_类
        c.depend4(d);
        c.depend5(d);

    }
}

interface Interface_1 {
    void method1();
}

interface Interface_2 {
    void method2();

    void method3();
}

interface Interface_3 {
    void method4();

    void method5();
}

class B_ implements Interface_1,Interface_2 {

    @Override
    public void method1() {
        System.out.println("类B实现方法1");
    }

    @Override
    public void method2() {
        System.out.println("类B实现方法2");
    }

    @Override
    public void method3() {
        System.out.println("类B实现方法3");
    }
}

class D_ implements Interface_1,Interface_3 {

    @Override
    public void method1() {
        System.out.println("类D实现方法1");
    }

    @Override
    public void method4() {
        System.out.println("类D实现方法4");
    }

    @Override
    public void method5() {
        System.out.println("类D实现方法5");
    }
}

class A_ {

    public void depend1(Interface_1 i) {
        i.method1();
    }

    public void depend2(Interface_2 i) {
        i.method2();
    }

    public void depend3(Interface_2 i) {
        i.method3();
    }
}

class C_ {

    public void depend1(Interface_1 i) {
        i.method1();
    }

    public void depend4(Interface_3 i) {
        i.method4();
    }

    public void depend5(Interface_3 i) {
        i.method5();
    }
}
