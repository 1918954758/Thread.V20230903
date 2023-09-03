package com.zichen.t3.waitOld;

/**
 * @Name: ThreadAdd
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/29 17:35:53
 * @Version: 1.0
 **/
public class ThreadAdd extends Thread {
    private Add p;
    ThreadAdd (Add p) {
        this.p = p;
    }

    @Override
    public void run() {
        p.add();
    }
}