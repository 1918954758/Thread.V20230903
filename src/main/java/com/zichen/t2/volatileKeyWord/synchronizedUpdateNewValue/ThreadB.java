package com.zichen.t2.volatileKeyWord.synchronizedUpdateNewValue;

/**
 * @Name: ThreadB
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/23 18:06:07
 * @Version: 1.0
 **/
public class ThreadB extends Thread {
    private Service service;
    ThreadB(Service service) {
        this.service =service;
    }

    @Override
    public void run() {
        service.stopMethod();
    }
}