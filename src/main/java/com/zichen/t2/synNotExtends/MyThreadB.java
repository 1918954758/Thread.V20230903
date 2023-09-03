package com.zichen.t2.synNotExtends;

/**
 * @Name: MyThreadB
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/15 20:01:58
 * @Version: 1.0
 **/
public class MyThreadB extends Thread{
    private Sub sub;
    public MyThreadB(Sub sub) {
        this.sub = sub;
    }

    @Override
    public void run() {
        sub.serviceMethod();
    }
}