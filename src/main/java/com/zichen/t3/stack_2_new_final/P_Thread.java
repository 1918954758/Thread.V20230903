package com.zichen.t3.stack_2_new_final;

/**
 * @Name: P_Thread
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/30 13:46:44
 * @Version: 1.0
 **/
public class P_Thread extends Thread {
    private P p;
    P_Thread (P p) {
        this.p = p;
    }

    @Override
    public void run() {
        while (true) {
            p.pushService();
        }
    }
}