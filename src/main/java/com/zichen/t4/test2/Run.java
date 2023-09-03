package com.zichen.t4.test2;

/**
 * @Name: Run
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/05/06 20:40:36
 * @Version: 1.0
 **/
public class Run {
    public static void main(String[] args) throws InterruptedException {
        final Service service = new Service();
        Runnable runnable = service::waitMethod;
        Thread[] threadArrry = new Thread[10];
        for (int i = 0; i < 10; i++) {
            threadArrry[i] = new Thread(runnable);
            threadArrry[i].start();
        }
        Thread.sleep(2000);
        service.notifyMethod();
        Thread.sleep(2000);
        service.notifyMethod();
    }
}