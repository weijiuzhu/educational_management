package cn.com.crtvu.factorymode.Factory;

import cn.com.crtvu.factorymode.Factory.Pizza;
import cn.com.crtvu.factorymode.Factory.PizzaStore;
import cn.com.crtvu.factorymode.chicago.ChicagoStyleCheesePizza;
import cn.com.crtvu.factorymode.chicago.ChicagoStyleClamPizza;
import cn.com.crtvu.factorymode.newyork.NYStyleCheesePizza;
import cn.com.crtvu.factorymode.newyork.NYStyleClamPizza;

/**
 * Created by weijiuzhu on 2019/7/21.
 */
public class ChicagoPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")){
            return new ChicagoStyleCheesePizza();
        } else if (type.equals("clam")){
            return new ChicagoStyleClamPizza();
        } else return null;
    }
}
