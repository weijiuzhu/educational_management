package cn.com.crtvu.strategymode;

import cn.com.crtvu.strategymode.impl.MallardDuck;
import cn.com.crtvu.strategymode.impl.fly.FlyWithWings;
import cn.com.crtvu.strategymode.impl.quack.MuteQuack;
import cn.com.crtvu.strategymode.impl.quack.Quack;

/**
 * Created by weijiuzhu on 2019/7/14.
 */
public class Test {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        FlyWithWings flyWithWings = new FlyWithWings();
       QuackBehavior quackBehavior = new Quack();
        mallardDuck.setFlyBehavior(flyWithWings);
        mallardDuck.setQuackBehavior(quackBehavior);

        mallardDuck.performFly();
        mallardDuck.performQuack();
        mallardDuck.display();
    }
}
