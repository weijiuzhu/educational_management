package cn.com.crtvu.factorymode;

import cn.com.crtvu.factorymode.Factory.ChicagoPizzaStore;
import cn.com.crtvu.factorymode.Factory.PizzaStore;

/**
 * Created by weijiuzhu on 2019/7/21.
 */
public class test {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new ChicagoPizzaStore();
        pizzaStore.orderPizza("cl");
    }
}
