package com.zichen.t1.methods.sleep.t8;

/**
 * @Name: Run1
 * @Description: 调用 start() 方法  异步执行，启动线程执行
 * @User: xdSun
 * @Date: 2023/04/09 14:05:34
 * @Version: 1.0
 **/
public class Run2 {
    public static void main(String[] args) {
        MyThread1 myThread2 = new MyThread1();
        System.out.println("begin = " + System.currentTimeMillis());
        myThread2.start();
        System.out.println("end = " + System.currentTimeMillis());
    }
}