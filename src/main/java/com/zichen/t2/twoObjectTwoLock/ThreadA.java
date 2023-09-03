package com.zichen.t2.twoObjectTwoLock;

/**
 * @Name: ThreadA
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/14 22:05:41
 * @Version: 1.0
 **/
public class ThreadA extends Thread{
    private HasSelfPrivateNum numRef;
    public ThreadA(HasSelfPrivateNum numRef) {
        super();
        this.numRef = numRef;
    }
    @Override
    public void run () {
        numRef.addI("a");
    }
}