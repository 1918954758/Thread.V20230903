package com.zichen.t3.joinLong;

/**
 * @Name: Test
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/05/01 12:39:08
 * @Version: 1.0
 **/
public class Test {
    public static void main(String[] args) {
        try {
            Thread.currentThread().setName(" 主线程 ");
            System.out.println("begin timer = " + System.currentTimeMillis() + " - " + Thread.currentThread().getName());
            MyThread myThread = new MyThread();
            myThread.setName("MyThread");
            myThread.start();
            myThread.join(2000);
//            Thread.sleep(2000);
            System.out.println("end   timer = " + System.currentTimeMillis() + " - " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}