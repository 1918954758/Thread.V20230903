package com.zichen.t2.t6;

/**
 * @Name: MyThread1
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/15 21:39:52
 * @Version: 1.0
 **/
public class MyThread1 extends Thread {
    private Task task;
    public MyThread1(Task task) {
        super();
        this.task = task;
    }
    @Override
    public void run() {
        super.run();
        CommonUtils.beginTime1 = System.currentTimeMillis();
        task.doLongTimeTask();
        CommonUtils.endTime1 = System.currentTimeMillis();
    }
}