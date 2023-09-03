package com.zichen.t3.p_r_test;

/**
 * @Name: ThreadC
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/30 11:15:28
 * @Version: 1.0
 **/
public class ThreadC extends Thread {
    private C c;
    ThreadC (C c) {
        this.c = c;
    }

    @Override
    public void run() {
        while (true) {
            c.getValue();
        }
    }
}