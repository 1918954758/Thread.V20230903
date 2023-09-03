package com.zichen.t2.t9;

/**
 * @Name: MyThread1
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/16 18:24:27
 * @Version: 1.0
 **/
public class MyThread1 extends Thread {
    private MyOneList list;
    MyThread1(MyOneList list) {
        this.list = list;
    }

    @Override
    public void run() {
        MyService service = new MyService();
        service.addServiceMethod(list, "A");
    }
}