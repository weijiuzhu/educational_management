package cn.com.crtvu.factorymode.Factory;

import cn.com.crtvu.factorymode.Factory.Pizza;
import cn.com.crtvu.factorymode.Factory.PizzaStore;
import cn.com.crtvu.factorymode.newyork.NYStyleCheesePizza;
import cn.com.crtvu.factorymode.newyork.NYStyleClamPizza;

/**
 * 纽约披萨工厂
 * Created by weijiuzhu on 2019/7/21.
 */
public class NYPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")){
            return new NYStyleCheesePizza();
        } else if (type.equals("clam")){
            return new NYStyleClamPizza();
        } else return null;
    }
}
