package com.zichen.t1.t12;

/**
 * @Name: Test
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/09 14:55:58
 * @Version: 1.0
 **/
public class Run1 {
    public static void main(String[] args) {
        try {
            MyThread myThread = new MyThread();
            myThread.setName("myThread");
            myThread.start();
            Thread.sleep(1000);
            myThread.interrupt();
            System.out.println(" 是否停止1？ = " + Thread.interrupted() + " thread = " + Thread.currentThread().getName());
            System.out.println(" 是否停止2？ = " + Thread.interrupted() + " thread = " + Thread.currentThread().getName());
//            ThreadA.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}