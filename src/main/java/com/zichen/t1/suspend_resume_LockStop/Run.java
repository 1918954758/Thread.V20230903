package com.zichen.t1.suspend_resume_LockStop;

/**
 * @Name: Test
 * @Description: suspend() 配合循环造成的独占锁
 * @User: xdSun
 * @Date: 2023/04/09 20:31:03
 * @Version: 1.0
 **/
public class Run {
    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(1000);
            thread.suspend();
            System.out.println("main end!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}