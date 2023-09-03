package com.zichen.t2.synNotExtends;

/**
 * @Name: Sub
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/15 19:59:35
 * @Version: 1.0
 **/
public class Sub extends Main {
    @Override
    synchronized public void serviceMethod() {
        try {
            System.out.println("int sub 下一步 sleep begin threadName = " + Thread.currentThread().getName() + " time = " + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("int sub 下一步 sleep end threadName = " + Thread.currentThread().getName() + " time = " + System.currentTimeMillis());
            super.serviceMethod();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}