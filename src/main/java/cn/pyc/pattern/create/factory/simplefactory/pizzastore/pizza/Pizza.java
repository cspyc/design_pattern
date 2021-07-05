package cn.pyc.pattern.create.factory.simplefactory.pizzastore.pizza;

/**
 * @author pi
 * @date 2021/07/06 00:00:38
 **/
public abstract class Pizza {
    private String name;

    /**
     * 准备制作原材料
     */
    public abstract void prepare();

    public void bake() {
        System.out.println(name + " baking");
    }

    public void cut() {
        System.out.println(name + " cutting;");
    }

    public void box() {
        System.out.println(name + " boxing");
    }

    public void setName(String name) {
        this.name = name;
    }
}
