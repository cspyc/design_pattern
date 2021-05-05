package cn.pyc.principle.dependenceinversion;

/**
 * @author Pi
 * @date 2021-05-05 11:08
 */
public class DependenceInversion1 {
    public static void main(String[] args) {
        //编程实现一个Person类，接收消息
        Email email = new Email();
        Person person = new Person();
        person.receiveMessage(email);
    }
}

class Email {
    public String getInfo() {
        return "电子邮件信息：hello,message!";
    }
}

//方法receiveMessage(Email email) //依赖具体实现类
//如果Person需要接收其他类型的消息，那么不仅要创建新的具体消息类，还要新增接收消息实现
class Person {
    public void receiveMessage(Email email) {//依赖具体实现类
        System.out.println(email.getInfo());
    }
}
