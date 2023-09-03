package com.zichen.t2.t7;

/**
 * @Name: ThreadB
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/16 13:34:48
 * @Version: 1.0
 **/
public class ThreadB extends Thread {
    private Task task;
    ThreadB(Task task) {
        this.task = task;
    }
    @Override
    public void run() {
        task.doLongTimeTask();
    }
}