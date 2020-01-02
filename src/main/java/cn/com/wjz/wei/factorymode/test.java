package cn.com.wjz.wei.factorymode;

import cn.com.wjz.wei.factorymode.Factory.ChicagoPizzaStore;
import cn.com.wjz.wei.factorymode.Factory.PizzaStore;

/**
 * Created by weijiuzhu on 2019/7/21.
 */
public class test {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new ChicagoPizzaStore();
        pizzaStore.orderPizza("cl");
    }
}
