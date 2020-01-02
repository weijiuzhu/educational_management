package cn.com.wjz.wei.threadtest;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by weijiuzhu on 2019/7/16.
 */
public class Deprecated {
    public static void main(String[] args) throws InterruptedException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
        System.out.println("这是main线程名" + Thread.currentThread().getName());
        Thread thread = new Thread(new Runner());
        thread.setDaemon(true);
        thread.start();
        TimeUnit.SECONDS.sleep(3);
        thread.suspend();
        System.out.println("线程暂停" + simpleDateFormat.format(new Date()));
        TimeUnit.SECONDS.sleep(3);
        thread.resume();
        System.out.println("线程继续" + simpleDateFormat.format(new Date()));
        TimeUnit.SECONDS.sleep(3);
        thread.stop();
        System.out.println("线程停止" + simpleDateFormat.format(new Date()));
        TimeUnit.SECONDS.sleep(3);
    }
}

class Runner implements Runnable{

    @Override
    public void run() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
        while (true){
            System.out.println(Thread.currentThread().getName() + "Run at " + simpleDateFormat.format(new Date()));
            SleepUtils.second(1);
        }
    }
}
