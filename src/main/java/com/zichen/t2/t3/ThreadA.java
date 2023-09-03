package com.zichen.t2.t3;

/**
 * @Name: ThreadA
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/14 23:39:09
 * @Version: 1.0
 **/
public class ThreadA extends Thread{
    private PublicVar publicVar;
    public ThreadA(PublicVar publicVar) {
        super();
        this.publicVar = publicVar;
    }

    @Override
    public void run() {
        super.run();
        publicVar.setValue("B", "BB");
    }
}