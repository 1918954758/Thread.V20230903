package com.zichen.t2.setNewPropertiesLockOne;

import com.zichen.t2.setNewStringTwoLock.MyService;

/**
 * @Name: ThreadB
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/22 16:25:05
 * @Version: 1.0
 **/
public class ThreadB extends Thread{
    private Service service;
    private UserInfo userInfo;
    ThreadB(Service service, UserInfo userInfo) {
        this.service = service;
        this.userInfo = userInfo;
    }

    @Override
    public void run() {
        service.serviceMethodA(userInfo);
    }
}