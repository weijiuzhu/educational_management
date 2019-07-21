package cn.com.crtvu.factorymode.Factory;

/**
 * Created by weijiuzhu on 2019/7/21.
 */
public abstract class Pizza {

    public abstract void pizzaName();
    public void prepare(){
        System.out.println("准备！");
    }

    public  void bake(){
        System.out.println("烘烤!");
    }

    public void cut(){
        System.out.println("切！");
    }

    public void box(){
        System.out.println("装盒！");
    }
}
