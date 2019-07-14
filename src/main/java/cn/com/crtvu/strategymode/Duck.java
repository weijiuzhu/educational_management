package cn.com.crtvu.strategymode;

/**
 * 鸭子抽象类
 * Created by weijiuzhu on 2019/7/14.
 */
public abstract class Duck {

    public Duck(){
        super();
    }

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public abstract void display();

    //飞行行为
    public void performFly(){
        flyBehavior.fly();
    }

    //鸭子叫行为
    public void performQuack(){
        quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior){
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior){
        this.quackBehavior = quackBehavior;
    }
}
