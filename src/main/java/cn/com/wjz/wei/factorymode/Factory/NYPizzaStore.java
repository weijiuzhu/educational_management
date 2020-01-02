package cn.com.wjz.wei.factorymode.Factory;

import cn.com.wjz.wei.factorymode.newyork.NYStyleCheesePizza;
import cn.com.wjz.wei.factorymode.newyork.NYStyleClamPizza;

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
