package com.zichen.t3.stack_2_new;

/**
 * @Name: C_Thread
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/30 13:50:37
 * @Version: 1.0
 **/
public class C_Thread extends Thread {
    private C c;
    C_Thread (C c) {
        this.c = c;
    }

    @Override
    public void run() {
        while (true) {
            c.popService();
        }
    }
}