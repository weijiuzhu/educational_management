package cn.com.crtvu.threadtest;

import java.util.concurrent.TimeUnit;

/**
 * Created by weijiuzhu on 2019/7/16.
 */
public class SleepUtils {
    public static final void second(long seconds){
        try {
            TimeUnit.SECONDS.sleep(seconds);
        }catch (Exception e){

        }
    }
}
