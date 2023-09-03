package com.zichen.t2.synNotExtends;

import com.zichen.t2.throwExceptionNoLock.ThreadB;

/**
 * @Name: MyThreadA
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/15 20:00:47
 * @Version: 1.0
 **/
public class MyThreadA extends Thread {
    private Sub sub;
    public MyThreadA(Sub sub) {
        this.sub = sub;
    }

    @Override
    public void run() {
        sub.serviceMethod();
    }
}