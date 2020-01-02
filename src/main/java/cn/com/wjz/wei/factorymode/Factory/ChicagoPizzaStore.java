package cn.com.wjz.wei.factorymode.Factory;

import cn.com.wjz.wei.factorymode.chicago.ChicagoStyleCheesePizza;
import cn.com.wjz.wei.factorymode.chicago.ChicagoStyleClamPizza;

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
