package com.zichen.t2.synLockIn_1;

/**
 * @Name: Service
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/15 19:18:43
 * @Version: 1.0
 **/
public class Service {
    synchronized public void service1() {
        System.out.println("service1");
        service2();
    }
    synchronized public void service2() {
        System.out.println("service2");
        service3();
    }
    synchronized public void service3() {
        System.out.println("service3");
        ServiceOther serviceOther = new ServiceOther();
        serviceOther.service1();
    }
}