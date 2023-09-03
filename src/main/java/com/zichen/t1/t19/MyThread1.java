package com.zichen.t1.t19;

import java.util.Random;

/**
 * @Name: MyThread1
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/13 20:34:12
 * @Version: 1.0
 **/
public class MyThread1 extends Thread{
    @Override
    public void run() {
        long beginTime = System.currentTimeMillis();
        long addResult = 0;
        for (int i = 0; i < 10; i++) {
             for (int j = 0; j < 50000; j++) {
                 Random random = new Random();
                 random.nextInt();
                 addResult = addResult + i;
             }
        }
        long endTime = System.currentTimeMillis();
        System.out.println(" ★ ★ ★ ★ ★ thread 1 use time = " + (endTime - beginTime));
    }
}