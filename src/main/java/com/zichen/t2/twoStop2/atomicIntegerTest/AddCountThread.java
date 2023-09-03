package com.zichen.t2.twoStop2.atomicIntegerTest;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Name: AddCountThread
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/23 12:48:16
 * @Version: 1.0
 **/
public class AddCountThread extends Thread{
    private AtomicInteger count = new AtomicInteger();

    @Override
    public void run() {
        for (int i = 0; i < 10000; ++i) {
            System.out.println(count.incrementAndGet());
        }
    }
}