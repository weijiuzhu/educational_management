package cn.com.wjz.wei.strategymode.impl.quack;

import cn.com.wjz.wei.strategymode.QuackBehavior;

/**
 * 呱呱叫行为类实现
 * Created by weijiuzhu on 2019/7/14.
 */
public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("呱呱叫~~~~~~");
    }
}
