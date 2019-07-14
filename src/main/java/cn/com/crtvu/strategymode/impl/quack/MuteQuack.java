package cn.com.crtvu.strategymode.impl.quack;

import cn.com.crtvu.strategymode.QuackBehavior;

/**
 * 咕咕叫行为类实现
 * Created by weijiuzhu on 2019/7/14.
 */
public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("咕咕叫~~~~~~~");
    }
}
