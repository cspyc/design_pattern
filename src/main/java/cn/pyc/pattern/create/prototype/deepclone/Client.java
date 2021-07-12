package cn.pyc.pattern.create.prototype.deepclone;

/**
 * @author pi
 * @date 2021/07/12 00:02:52
 **/
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        DeepProtoType deepProtoType = new DeepProtoType();
        deepProtoType.setName("jacky");
        deepProtoType.setDeepCloneableTarget(new DeepCloneableTarget("haha", "haah.class"));

        DeepProtoType dp2 = (DeepProtoType) deepProtoType.deepClone();

        System.out.println(deepProtoType.getName() + deepProtoType.getDeepCloneableTarget().hashCode());
        System.out.println(dp2.getName() + dp2.getDeepCloneableTarget().hashCode());
    }
}
