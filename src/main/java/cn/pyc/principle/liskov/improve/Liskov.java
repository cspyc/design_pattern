package cn.pyc.principle.liskov.improve;

/**
 * @author Pi
 * @date 2021-05-05 16:39
 */
public class Liskov {
}


//根据里氏替换原则，打破原有继承关系，使用组合

class Base {

}

class A_ extends Base {
    public int fun1(int a, int b) {
        return a - b;
    }
}

class B_ extends Base {
    //在B_中要使用A_，使用组合的方式
    private A_ a;

    //此处重写了fun1方法
    public int fun1(int a, int b) {
        return a + b;
    }

    public int fun2(int a, int b) {
        return this.fun1(a, b) * 100;
    }

    public int fun3(int a,int b){
        return this.a.fun1(a,b);
    }
}
