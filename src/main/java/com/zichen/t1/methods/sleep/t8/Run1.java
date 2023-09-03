package com.zichen.t1.methods.sleep.t8;

/**
 * @Name: Run1
 * @Description: 直接调用 run() 方法  同步执行，并未启动线程
 * @User: xdSun
 * @Date: 2023/04/09 14:05:34
 * @Version: 1.0
 **/
public class Run1 {
    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1();
        System.out.println("begin = " + System.currentTimeMillis());
        myThread1.run();
        System.out.println("end = " + System.currentTimeMillis());
    }
}