package com.zichen.t2.throwExceptionNoLock;

/**
 * @Name: Service
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/15 19:42:06
 * @Version: 1.0
 **/
public class Service {
    synchronized public void testMethod() {
        if ("a".equals(Thread.currentThread().getName())) {
            System.out.println("ThreadName = " + Thread.currentThread().getName() + " run beginTime = " + System.currentTimeMillis());
            int i = 1;
            while (i == 1) {
                if (("" + Math.random()).substring(0, 8).equals("0.123456")) {
                    System.out.println("ThreadName = " + Thread.currentThread().getName() + " run exceptionTime = " + System.currentTimeMillis());
                    Integer.parseInt("a");
                }
            }
        } else {
            System.out.println("ThreadA B run Time = " + System.currentTimeMillis());
        }
    }
}