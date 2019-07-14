package cn.com.crtvu.strategymode.impl.fly;

import cn.com.crtvu.strategymode.FlyBehavior;

/**
 * 不会飞的鸭子行为实现
 * Created by weijiuzhu on 2019/7/14.
 */
public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("不会飞，哈哈哈哈");
    }
}
