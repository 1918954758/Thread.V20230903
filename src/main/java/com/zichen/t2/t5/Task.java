package com.zichen.t2.t5;

/**
 * @Name: Task
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/15 21:12:00
 * @Version: 1.0
 **/
public class Task {
    private String getData1;
    private String getData2;
    synchronized public void doLongTimeTask() {
        try {
            System.out.println("begin task");
            Thread.sleep(5000);
            getData1 = " 长时间处理任务后从远程返回的值 1 threadName = " + Thread.currentThread().getName();
            getData2 = " 长时间处理任务后从远程返回的值 2 threadName = " + Thread.currentThread().getName();
            System.out.println(getData1);
            System.out.println(getData2);
            System.out.println("end task");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}