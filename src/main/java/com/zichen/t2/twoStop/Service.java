package com.zichen.t2.twoStop;

/**
 * @Name: Service
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/16 22:02:44
 * @Version: 1.0
 **/
public class Service {
    synchronized public void methodA() {
        System.out.println("methodA begin");
        boolean isContinueRun = true;
        while (isContinueRun) {
            //System.out.println("print me forever...");
        }
        System.out.println("methodA   end");
    }
    synchronized public void methodB() {
        System.out.println("methodB begin");
        System.out.println("methodB   end");
    }
}