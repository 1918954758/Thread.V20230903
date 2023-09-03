package com.zichen.t2.t8;

/**
 * @Name: MyThread2
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/16 14:01:08
 * @Version: 1.0
 **/
public class MyThread2 extends Thread {
    private Task task;
    MyThread2(Task task) {
        this.task = task;
    }

    @Override
    public void run() {
        task.otherMethod();
    }
}