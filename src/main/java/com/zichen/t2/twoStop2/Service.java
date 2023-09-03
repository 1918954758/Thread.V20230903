package com.zichen.t2.twoStop2;

/**
 * @Name: Service
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/16 22:02:44
 * @Version: 1.0
 **/
public class Service {
    public void methodA(Object object) {
        System.out.println("methodA begin");
        boolean isContinueRun = true;
        synchronized(object) {
            while (isContinueRun) {}
        }
        System.out.println("methodA   end");
    }
    public void methodB(Object object) {
        synchronized (object) {
            System.out.println("methodB begin");
            System.out.println("methodB   end");
        }
    }
}