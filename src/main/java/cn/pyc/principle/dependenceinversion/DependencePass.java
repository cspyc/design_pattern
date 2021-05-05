package cn.pyc.principle.dependenceinversion;

/**
 * @author Pi
 * @date 2021-05-05 15:50
 */
public class DependencePass {
    public static void main(String[] args) {
//        MiTV miTV = new MiTV();
//        MiSwitch miSwitch = new MiSwitch();
//        miSwitch.open(miTV);

//        ChangHong changHong = new ChangHong();
//        Switch_ switch_ = new Switcher(changHong);
//        switch_.open();

        Kong kongTv = new Kong();
        KongSwitch kongSwitch = new KongSwitch();
        kongSwitch.setTv(kongTv);
        kongSwitch.open();
    }
}

//接口传递依赖
interface Switch {
    void open(TV tv);
}

interface TV {
    void play();
}

class MiTV implements TV {

    @Override
    public void play() {
        System.out.println("小米电视正在播放...");
    }
}

class MiSwitch implements Switch {

    @Override
    public void open(TV tv) {
        tv.play();
    }
}

//构造器传递依赖
interface Switch_ {
    void open();
}

interface TV_ {
    void play();
}

class Switcher implements Switch_ {
    private TV_ tv;

    @Override
    public void open() {
        this.tv.play();
    }

    public Switcher(TV_ tv) {
        this.tv = tv;
    }
}

class ChangHong implements TV_ {

    @Override
    public void play() {
        System.out.println("长虹电视正在播放《设计模式》视频....");
    }
}

//setter传递依赖
interface TV1 {
    void play();
}

interface Switch1 {
    void open();
}

class Kong implements TV1 {

    @Override
    public void play() {
        System.out.println("康佳电视开始打开播放。。。。。");
    }

}

class KongSwitch implements Switch1 {
    private TV1 tv;

    @Override
    public void open() {
        this.tv.play();
    }

    public void setTv(TV1 tv) {
        this.tv = tv;
    }
}