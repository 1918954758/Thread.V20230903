package com.zichen.t2.twoObjectTwoLock;

/**
 * @Name: ThreadB
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/14 22:10:57
 * @Version: 1.0
 **/
public class ThreadB extends Thread{
    private HasSelfPrivateNum numRef;
    public ThreadB(HasSelfPrivateNum numRef) {
        super();
        this.numRef = numRef;
    }
    @Override
    public void run() {
        numRef.addI("b");
    }
}