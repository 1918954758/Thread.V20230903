package com.zichen.t4.ConditionTestManyToMany_ManyCondition;

/**
 * @Name: ThreadA
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/05/03 00:54:20
 * @Version: 1.0
 **/
public class ThreadA extends Thread {
    private MyService service;
    ThreadA (MyService service) {
        this.service = service;
    }

    @Override
    public void run() {
        while (true) {
            service.set();
        }
    }
}