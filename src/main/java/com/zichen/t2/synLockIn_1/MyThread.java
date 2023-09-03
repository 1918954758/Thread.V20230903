package com.zichen.t2.synLockIn_1;

/**
 * @Name: MyThread
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/15 19:19:57
 * @Version: 1.0
 **/
public class MyThread extends Thread{
    @Override
    public void run() {
        Service service = new Service();
        service.service1();
    }
}