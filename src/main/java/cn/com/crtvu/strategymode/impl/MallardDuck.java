package cn.com.crtvu.strategymode.impl;

import cn.com.crtvu.strategymode.Duck;
import cn.com.crtvu.strategymode.FlyBehavior;
import cn.com.crtvu.strategymode.impl.fly.FlyNoWay;

/**
 * Created by weijiuzhu on 2019/7/14.
 */
public class MallardDuck extends Duck {

    @Override
    public void display() {
        System.out.println("这是一个鸭子的具体实现类");
    }

}
