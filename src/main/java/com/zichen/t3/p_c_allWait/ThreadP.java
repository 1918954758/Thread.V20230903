package com.zichen.t3.p_c_allWait;

/**
 * @Name: ThreadP
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/30 11:45:31
 * @Version: 1.0
 **/
public class ThreadP extends Thread {
    private P p;
    ThreadP (P p) {
        this.p = p;
    }

    @Override
    public void run() {
        while (true) {
            p.setValue();
        }
    }
}