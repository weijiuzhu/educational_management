package cn.com.wjz.wei.strategymode.impl;

import cn.com.wjz.wei.strategymode.Duck;

/**
 * Created by weijiuzhu on 2019/7/14.
 */
public class MallardDuck extends Duck {

    @Override
    public void display() {
        System.out.println("这是一个鸭子的具体实现类");
    }

}
