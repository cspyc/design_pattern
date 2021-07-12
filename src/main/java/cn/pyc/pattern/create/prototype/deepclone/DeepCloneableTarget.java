package cn.pyc.pattern.create.prototype.deepclone;

import java.io.Serializable;

/**
 * @author pi
 * @date 2021/07/11 23:57:14
 **/
public class DeepCloneableTarget implements Serializable, Cloneable {
    private static final long serialVersionUID = 1L;

    private String cloneName;
    private String cloneClass;

    public DeepCloneableTarget(String cloneName, String cloneClass) {
        this.cloneName = cloneName;
        this.cloneClass = cloneClass;
    }

    /**
     * 属性为基本数据类型，可以使用默认的clone实现
     *
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
