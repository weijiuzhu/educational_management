package cn.com.crtvu.strategymode.impl.fly;

import cn.com.crtvu.strategymode.FlyBehavior;

/**
 * 会飞的鸭子实现类
 * Created by weijiuzhu on 2019/7/14.
 */
public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("会飞，哈哈哈");
    }
}
