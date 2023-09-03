package com.zichen.t4.test3;

/**
 * @Name: Run
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/05/06 20:50:56
 * @Version: 1.0
 **/
public class Run {
    public static void main(String[] args) throws InterruptedException {
        final Service service = new Service(true);
        Runnable runnable = service::serviceMethod;
        Thread thread = new Thread(runnable);
        thread.start();
        Thread.sleep(1000);
        final Service service2 = new Service(false);
        Runnable runnable2 = service2::serviceMethod;
        Thread thread2 = new Thread(runnable2);
        thread2.start();
    }
}