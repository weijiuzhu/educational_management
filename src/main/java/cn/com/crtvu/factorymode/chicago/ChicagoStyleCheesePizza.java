package cn.com.crtvu.factorymode.chicago;

import cn.com.crtvu.factorymode.Factory.Pizza;

/**
 * Created by weijiuzhu on 2019/7/21.
 */
public class ChicagoStyleCheesePizza extends Pizza{
    @Override
    public void pizzaName() {
        System.out.println("芝加哥第一种风味披萨！");
    }
}
