package com.zichen.t2.synBlockMoreObjectOneLock;

/**
 * @Name: Service
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/16 19:09:44
 * @Version: 1.0
 **/
public class Service {
    public static void printA() {
        try {
            synchronized(Service.class) {
                System.out.println(" 线程名称为： " + Thread.currentThread().getName() + " 在 " + System.currentTimeMillis() + " 进入printA");
                Thread.sleep(3000);
                System.out.println(" 线程名称为： " + Thread.currentThread().getName() + " 在 " + System.currentTimeMillis() + " 离开printA");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void printB() {
        synchronized (Service.class) {
            System.out.println(" 线程名称为： " + Thread.currentThread().getName() + " 在 " + System.currentTimeMillis() + " 进入printB");
            System.out.println(" 线程名称为： " + Thread.currentThread().getName() + " 在 " + System.currentTimeMillis() + " 离开printB");
        }
    }
}