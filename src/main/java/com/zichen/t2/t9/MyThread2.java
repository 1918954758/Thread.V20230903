package com.zichen.t2.t9;

/**
 * @Name: MyThread2
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/16 18:26:28
 * @Version: 1.0
 **/
public class MyThread2 extends Thread {
    private MyOneList list;
    MyThread2(MyOneList list) {
        this.list = list;
    }

    @Override
    public void run() {
        MyService service = new MyService();
        service.addServiceMethod(list, "B");
    }
}