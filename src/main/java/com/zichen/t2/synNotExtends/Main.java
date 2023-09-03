package com.zichen.t2.synNotExtends;

/**
 * @Name: Main
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/15 19:57:15
 * @Version: 1.0
 **/
public class Main {
    synchronized public void serviceMethod() {
        try {
            System.out.println("int main 下一步 sleep begin threadName = " + Thread.currentThread().getName() + " time = " + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("int main 下一步 sleep end threadName = " + Thread.currentThread().getName() + " time = " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}