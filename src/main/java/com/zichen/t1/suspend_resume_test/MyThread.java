package com.zichen.t1.suspend_resume_test;

/**
 * @Name: suspend_resume_test
 * @Description: suspend()暂停线程 resume()恢复线程
 * @User: xdSun
 * @Date: 2023/04/09 18:15:32
 * @Version: 1.0
 **/
public class MyThread extends Thread {
    private long i = 0;
    public long getI() {
        return i;
    }
    public void setI(long i) {
        this.i = i;
    }

    @Override
    public void run() {
        while (true)
            i++;
    }
}