package com.zichen.t2.volatileKeyWord.atomicIntegerNoSafe;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @Name: MyService
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/23 14:18:17
 * @Version: 1.0
 **/
public class MyService {
    public static AtomicLong aiRef = new AtomicLong();
     public void addNum() {
        System.out.println(Thread.currentThread().getName() + " 加了 100 之后的值是： " + aiRef.addAndGet(100));
        aiRef.addAndGet(1);
    }
}