package com.zichen.t3.waitOld;

/**
 * @Name: ThreadSubtract
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/29 17:36:35
 * @Version: 1.0
 **/
public class ThreadSubtract extends Thread {
    private Subtract r;
    ThreadSubtract (Subtract r) {
        this.r = r;
    }

    @Override
    public void run() {
        r.subtract();
    }
}