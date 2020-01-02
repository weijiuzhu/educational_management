package cn.com.wjz.wei.factorymode.newyork;

import cn.com.wjz.wei.factorymode.Factory.Pizza;

/**
 * Created by weijiuzhu on 2019/7/21.
 */
public class NYStyleClamPizza extends Pizza {
    @Override
    public void pizzaName() {
        System.out.println("纽约第二种风味披萨！");
    }
}
