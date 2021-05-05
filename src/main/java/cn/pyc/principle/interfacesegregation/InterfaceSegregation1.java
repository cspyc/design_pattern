package cn.pyc.principle.interfacesegregation;

/**
 * @author Pi
 * @date 2021-05-05 10:33
 */
public class InterfaceSegregation1 {
    public static void main(String[] args) {
        //A通过Interface1会依赖(使用)B,但是A中只会使用到接口的1，2，3三个方法
        B b = new B();
        A a = new A();
        a.depend1(b);
        a.depend2(b);
        a.depend3(b);

        //C通过Interface1会依赖(使用)D,但是C中只会使用到接口的1,4,5三个方法
        D d = new D();
        C c = new C();
        c.depend1(d);
        c.depend4(d);
        c.depend5(d);

    }
}

interface Interface1 {
    void method1();

    void method2();

    void method3();

    void method4();

    void method5();
}

class B implements Interface1 {

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

    @Override
    public void method4() {
        System.out.println("类B实现方法4");
    }

    @Override
    public void method5() {
        System.out.println("类B实现方法5");
    }
}

class D implements Interface1 {

    @Override
    public void method1() {
        System.out.println("类D实现方法1");
    }

    @Override
    public void method2() {
        System.out.println("类D实现方法2");
    }

    @Override
    public void method3() {
        System.out.println("类D实现方法3");
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

class A {//A通过Interface1会依赖(使用)B,但是A中只会使用到接口的1，2，3三个方法

    public void depend1(Interface1 i) {
        i.method1();
    }

    public void depend2(Interface1 i) {
        i.method2();
    }

    public void depend3(Interface1 i) {
        i.method3();
    }
}

class C {//C通过Interface1会依赖(使用)D,但是C中只会使用到接口的1,4,5三个方法

    public void depend1(Interface1 i) {
        i.method1();
    }

    public void depend4(Interface1 i) {
        i.method4();
    }

    public void depend5(Interface1 i) {
        i.method5();
    }
}
