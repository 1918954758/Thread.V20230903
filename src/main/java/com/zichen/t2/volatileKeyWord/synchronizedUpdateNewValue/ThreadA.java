package com.zichen.t2.volatileKeyWord.synchronizedUpdateNewValue;

/**
 * @Name: ThreadA
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/23 18:05:27
 * @Version: 1.0
 **/
public class ThreadA extends Thread {
    private Service service;
    ThreadA(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.runMethod();
    }
}