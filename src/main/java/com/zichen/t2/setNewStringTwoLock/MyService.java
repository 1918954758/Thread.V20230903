package com.zichen.t2.setNewStringTwoLock;

/**
 * @Name: MyService
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/22 16:21:32
 * @Version: 1.0
 **/
public class MyService {
    private String lock = "123";
    public void testMethod() {
        try {
            synchronized (lock) {
                System.out.println(Thread.currentThread().getName() + " begin " + System.currentTimeMillis());
                lock = "456";
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName() + "   end" + System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}