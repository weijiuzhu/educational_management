package cn.com.crtvu.factorymode.newyork;

import cn.com.crtvu.factorymode.Factory.Pizza;

/**
 * Created by weijiuzhu on 2019/7/21.
 */
public class NYStyleCheesePizza extends Pizza{
    @Override
    public void pizzaName() {
        System.out.println("纽约第一种风味披萨！");
    }
}
