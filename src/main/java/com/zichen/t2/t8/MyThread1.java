package com.zichen.t2.t8;

/**
 * @Name: MyThread1
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/16 14:00:29
 * @Version: 1.0
 **/
public class MyThread1 extends Thread {
    private Task task;
    MyThread1(Task task) {
        this.task = task;
    }

    @Override
    public void run() {
        task.doLongTimeTask();
    }
}