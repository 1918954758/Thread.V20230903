package com.zichen.t4.test1;

/**
 * @Name: Run
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/05/06 20:31:54
 * @Version: 1.0
 **/
public class Run {
    public static void main(String[] args) throws InterruptedException {
        final Service service = new Service();
        Runnable runnable = service::waitMethod;
        Thread threadA = new Thread(runnable);
        threadA.start();
        Thread.sleep(500);
        Thread threadB = new Thread(runnable);
        threadB.start();
        Thread.sleep(500);
        // 判断线程 A 是否正在获取此锁 false
        System.out.println(service.lock.hasQueuedThread(threadA));
        // 判断线程 B 是否正在获取此锁 true
        System.out.println(service.lock.hasQueuedThread(threadB));
        // 判断是否有线程正在获取此锁 true
        System.out.println(service.lock.hasQueuedThreads());
    }
}