package com.zichen.t3.p_c_allWait;

/**
 * @Name: ThreadC
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/30 11:46:14
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