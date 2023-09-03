package com.zichen.t2.syn_out_asyn;

/**
 * @Name: MyThreadB
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/16 16:55:18
 * @Version: 1.0
 **/
public class MyThreadB extends Thread {
    private MyList list;
    MyThreadB(MyList list) {
        this.list = list;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            list.add("threadB " + (i + 1));
        }
    }
}