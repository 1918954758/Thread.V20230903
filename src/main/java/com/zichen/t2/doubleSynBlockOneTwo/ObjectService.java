package com.zichen.t2.doubleSynBlockOneTwo;

/**
 * @Name: ObjectService
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/16 13:46:39
 * @Version: 1.0
 **/
public class ObjectService {
    public void serviceMethodA() {
        try {
            synchronized (this) {
                System.out.println("A begin time = " + System.currentTimeMillis());
                Thread.sleep(2000);
                System.out.println("A end time = " + System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void serviceMethodB() {
        synchronized (this) {
            System.out.println("B begin time = " + System.currentTimeMillis());
            System.out.println("B end time = " + System.currentTimeMillis());
        }
    }
}