package cn.com.crtvu.factorymode.newyork;

import cn.com.crtvu.factorymode.Factory.Pizza;

/**
 * Created by weijiuzhu on 2019/7/21.
 */
public class NYStyleClamPizza extends Pizza {
    @Override
    public void pizzaName() {
        System.out.println("纽约第二种风味披萨！");
    }
}
