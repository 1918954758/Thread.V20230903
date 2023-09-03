package com.zichen.t4.useConditionWaitNotifyOk;

/**
 * @Name: Run
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/05/02 20:19:58
 * @Version: 1.0
 **/
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyService myService = new MyService();
        ThreadA a = new ThreadA(myService);
        a.start();
        Thread.sleep(5000);
        myService.signal();
    }
}