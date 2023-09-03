package com.zichen.t2.test2;

/**
 * @Name: Test
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/16 18:49:58
 * @Version: 1.0
 **/
public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        Thread1 thread1 = new Thread1(service);
        thread1.setName("A");
        thread1.start();
        Thread2 thread2 = new Thread2(service);
        thread2.setName("B");
        thread2.start();
    }
}