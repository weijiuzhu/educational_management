package cn.com.wjz.wei.strategymode;

import cn.com.wjz.wei.strategymode.impl.MallardDuck;
import cn.com.wjz.wei.strategymode.impl.fly.FlyWithWings;
import cn.com.wjz.wei.strategymode.impl.quack.Quack;

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
