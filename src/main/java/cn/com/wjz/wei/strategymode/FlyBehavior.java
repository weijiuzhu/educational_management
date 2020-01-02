package cn.com.wjz.wei.strategymode;

/**
 * 飞行行为超类
 * Created by weijiuzhu on 2019/7/14.
 */
public interface FlyBehavior {

    //飞行方法，每个子类必须实现该方法
    public void fly();
}
