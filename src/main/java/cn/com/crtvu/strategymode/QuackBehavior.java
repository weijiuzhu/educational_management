package cn.com.crtvu.strategymode;

/**
 * 鸭子叫行为超类
 * Created by weijiuzhu on 2019/7/14.
 */
public interface QuackBehavior {

    //每个不同的鸭子叫行为都实现该方法
    public void quack();
}
