package com.zichen.t2.t7;

/**
 * @Name: ThreadA
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/16 13:33:19
 * @Version: 1.0
 **/
public class ThreadA extends Thread {
    private Task task;
    ThreadA(Task task) {
        this.task = task;
    }
    @Override
    public void run() {
        task.doLongTimeTask();
    }
}