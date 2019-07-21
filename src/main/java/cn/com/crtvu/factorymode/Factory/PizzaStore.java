package cn.com.crtvu.factorymode.Factory;

/**
 * Created by weijiuzhu on 2019/7/21.
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type){
        Pizza pizza;

        pizza = createPizza(type);
        if (pizza == null){
            System.out.println("还没推出该产品，敬请期待！");
            return null;
        }
        pizza.pizzaName();
        pizza.prepare();
        pizza.bake();;
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
