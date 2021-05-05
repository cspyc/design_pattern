package cn.pyc.principle.dependenceinversion;

/**
 * @author Pi
 * @date 2021-05-05 11:08
 */
public class DependenceInversion {
    public static void main(String[] args) {
        //编程实现一个Person类，接收消息
        Message message = new Email_();
        Message wechat = new Wechat();
        Person_ person_ = new Person_();
        person_.receiveMessage(message);
        person_.receiveMessage(wechat);
    }
}

//定义一个消息接口
interface Message {
    String getInfo();
}

class Email_ implements Message {
    public String getInfo() {
        return "电子邮件信息：hello,message!";
    }
}

class Wechat implements Message {

    @Override
    public String getInfo() {
        return "微信消息：你好";
    }
}

//方法receiveMessage(Message message) //依赖消息接口
//如果Person需要接收其他类型的消息，那么不仅要创建新的具体消息类，还要新增接收消息实现
class Person_ {
    public void receiveMessage(Message message) {//依赖具体实现类
        System.out.println(message.getInfo());
    }
}
