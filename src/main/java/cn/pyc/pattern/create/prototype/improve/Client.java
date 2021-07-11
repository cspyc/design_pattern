package cn.pyc.pattern.create.prototype.improve;

/**
 * @author pi
 * @date 2021/07/11 23:36:20
 **/
public class Client {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("tom", 1, "white");
        sheep.setFriend(new Sheep("jack", 2, "black"));

        Sheep sheep1 = (Sheep) sheep.clone();

        System.out.println(sheep1);
        System.out.println("sheep:" + sheep + "sheep friend:" + sheep.getFriend().hashCode());
        System.out.println("sheep1:" + sheep1 + "sheep1 friend:" + sheep.getFriend().hashCode());
    }
}
