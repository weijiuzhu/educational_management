package cn.com.crtvu.strategymode.impl.quack;

import cn.com.crtvu.strategymode.QuackBehavior;

/**
 * 不会叫行为类
 * Created by weijiuzhu on 2019/7/14.
 */
public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("不会叫~~~~~~~");
    }
}
