package com.zichen.t2.t6;

/**
 * @Name: MyThread2
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/15 21:41:24
 * @Version: 1.0
 **/
public class MyThread2 extends Thread {
    private Task task;
    public MyThread2(Task task) {
        super();
        this.task = task;
    }
    @Override
    public void run() {
        super.run();
        CommonUtils.beginTime2 = System.currentTimeMillis();
        task.doLongTimeTask();
        CommonUtils.endTime2 = System.currentTimeMillis();
    }
}