package com.zichen.t4.fair_noFair_test;

/**
 * @Name: RunFair
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/05/03 19:57:27
 * @Version: 1.0
 **/
public class RunFair {
    public static void main(String[] args) {
        MyService service = new MyService(true);
        Runnable runnable = () -> {
            System.out.println(" ★ 线程 " + Thread.currentThread().getName() + " 运行了 ");
            service.serviceMethod();
        };
        Thread[] threadArray = new Thread[10];
        for (int i = 0; i < 10; i++) {
            threadArray[i] = new Thread(runnable);
            threadArray[i].start();
        }
    }
}