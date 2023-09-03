package com.zichen.t1.suspend_resume_LockStop;

/**
 * @Name: MyThread
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/09 20:30:11
 * @Version: 1.0
 **/
public class MyThread extends Thread{
    private long i = 0;

    @Override
    public void run() {
        while (true) {
            i++;
            System.out.println("i = " + i);
        }
    }
}