package com.zichen.t3.wait_notify_size5.test1;

/**
 * @Name: Test
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/25 18:40:17
 * @Version: 1.0
 **/
public class Test {
    public static void main(String[] args) {
        T t = new T();
        Object lock = new Object();
        T1 t1 = new T1(t, lock);
        t1.start();
        T2 t2 = new T2(t, lock);
        t2.start();
    }
}